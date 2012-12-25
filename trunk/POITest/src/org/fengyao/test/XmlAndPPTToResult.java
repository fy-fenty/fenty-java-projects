package org.fengyao.test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.poi.hslf.model.AutoShape;
import org.apache.poi.hslf.model.Picture;
import org.apache.poi.hslf.model.Shape;
import org.apache.poi.hslf.model.ShapeTypes;
import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.model.TextBox;
import org.apache.poi.hslf.usermodel.RichTextRun;
import org.apache.poi.hslf.usermodel.SlideShow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

@SuppressWarnings( { "unchecked" })
public class XmlAndPPTToResult {
	public static String imageName = "图片ID";

	public static void main(String[] args) throws Exception {
		XmlAndPPTToResult t = new XmlAndPPTToResult();
		String xlsPath = "D:\\4.xls";
		String pptPath = "D:\\4.ppt";
		String outPPTPath = "D:\\44.ppt";
		t.createNewPPT(xlsPath, pptPath, outPPTPath);
	}

	public void testPrintExcelValue(String[] path) throws IOException {
		for (int i = 1; i < path.length; i++) {
			List<List<Map>> values = this.getValuesByExcel(path[i] + "");
			for (List<Map> listMap : values) {
				for (Map map : listMap) {
					for (Iterator it = map.keySet().iterator(); it.hasNext();) {
						Object obj = it.next();
						System.out.print(obj + "：" + map.get(obj) + "\t");
					}
					System.out.println("");
				}
			}
		}
	}

	private Object cloneObjectBySerial(Object obj) throws Exception {
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(byteOut);
		out.writeObject(obj);

		ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
		ObjectInputStream in = new ObjectInputStream(byteIn);

		return in.readObject();
	}

	/*
	 * 背景模板元素设置 Slide s = ss1.getSlides()[0]; TextBox tx = (TextBox)
	 * s.getBackground().getSheet().getShapes()[4];
	 * System.out.println(s.getBackground().getSheet().getShapes()[6]);
	 * AutoShape as = (AutoShape) s.getBackground().getSheet().getShapes()[6];
	 * System.out.println(as.getAnchor().y); System.out.println(tx.getText());
	 */
	public void createNewPPT(String excelPath, String pptPath, String outPath) throws IOException {
		List<Map> excelValues = this.getValuesByExcel(excelPath).get(0);
		String curPath = pptPath.substring(0, pptPath.lastIndexOf("\\"));
		InputStream is = new FileInputStream(pptPath);
		OutputStream os = new FileOutputStream(outPath);
		SlideShow ss = new SlideShow(is);
		Shape[] shs = ss.getSlides()[0].getShapes().clone();
		for (Map m : excelValues) {
			Slide s_n = ss.createSlide();
			for (Shape sh : shs) {
				int shType = sh.getShapeType();
				if (shType == ShapeTypes.TextBox || shType == ShapeTypes.Rectangle) {
					String text = null;
					RichTextRun rtr = null;
					switch (shType) {
					case ShapeTypes.TextBox:
						text = ((TextBox) sh).getText();
						break;
					case ShapeTypes.Rectangle:
						text = ((AutoShape) sh).getText();
					default:
						break;
					}
					if (text != null && text.trim().length() > 0) {
						String tx_key = text.replaceAll("[:：]$|\\s", "");
						if (!m.containsKey(text))
							continue;
						if (shType == ShapeTypes.TextBox) {
							rtr = ((TextBox) sh).getTextRun().getRichTextRunAt(0);
						} else {
							rtr = ((AutoShape) sh).getTextRun().getRichTextRunAt(0);
						}
						Rectangle anc = sh.getAnchor();
						for (Iterator it = m.keySet().iterator(); it.hasNext();) {
							String key = it.next() + "";
							String val = m.get(key) + "";
							if (key.equals(tx_key)) {
								if (imageName.equals(key)) {
									File f = new File(curPath + File.separator + val);
									if (!f.isFile()) {
										val += ".jpg";
										f = new File(curPath + File.separator + val);
									}
									Dimension imgSize = new Dimension(anc.width, anc.height);
									if (f.exists()) {
										BufferedImage bi = ImageIO.read(f);
										imgSize = new Dimension(bi.getWidth(), bi.getHeight());
										if (bi.getWidth() > anc.width) {
											double sizePercent = anc.getWidth() / bi.getWidth();
											int imgHeight = (int) (bi.getHeight() * sizePercent);
											imgSize.setSize(anc.width, imgHeight);
										}
										sh = new Picture(ss.addPicture(f, Picture.JPEG));
										sh.setAnchor(new Rectangle(anc.getLocation(), imgSize));
									} else {
										sh = new TextBox();
										TextBox tx_t = (TextBox) sh;
										tx_t.setAnchor(new Rectangle(anc.getLocation(), imgSize));
										RichTextRun rtr_t = tx_t.getTextRun().getRichTextRuns()[0];
										rtr_t.setFontName(rtr.getFontName());
										rtr_t.setFontSize(rtr.getFontSize());
										rtr_t.setFontColor(Color.RED);
										rtr_t.setAlignment(TextBox.AlignCenter);
										tx_t.setText(curPath + File.separator + val + "   图片没找到:(");
									}
								} else {
									TextBox tx_t = new TextBox();
									tx_t.setText(val);
									int tx_width = (int) (ss.getPageSize().getWidth() - (anc.x + anc.width + 10));
									Dimension tx_size = new Dimension(tx_width, anc.height);
									RichTextRun rtr_t = tx_t.getTextRun().getRichTextRunAt(0);
									rtr_t.setFontSize(rtr.getFontSize());
									rtr_t.setFontName(rtr.getFontName());
									rtr_t.setBold(rtr.isBold());
									rtr_t.setAlignment(TextBox.AlignLeft);
									tx_t.setAnchor(new Rectangle(new Point((anc.x + anc.width), anc.y), tx_size));
									s_n.addShape(tx_t);
								}
								break;
							}
						}
					}
				}
				s_n.addShape(sh);
			}
		}
		ss.write(os);
		is.close();
		os.close();
	}

	public List<List<Map>> getValuesByExcel(String path) throws IOException {
		List<List<Map>> result = new LinkedList<List<Map>>();
		InputStream is = new FileInputStream(path);
		Workbook wb = new HSSFWorkbook(is);
		int num_sheet = wb.getNumberOfSheets();
		for (int i = 0; i < num_sheet; i++) {
			List<Map> sheetValues = new LinkedList<Map>();
			Sheet sheet = wb.getSheetAt(i);
			Map keys = new HashMap();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			for (Iterator<Row> rit = sheet.rowIterator(); rit.hasNext();) {
				Row row = rit.next();
				int rowIndex = row.getRowNum();
				if (row.getCell(0) == null || row.getCell(0).toString().trim().equals("")) {
					break;
				}
				Map cells = new HashMap();
				for (Iterator<Cell> cit = row.cellIterator(); cit.hasNext();) {
					Cell cell = cit.next();
					if (cell.toString().trim().length() > 0) {
						int cellIndex = cell.getColumnIndex();
						if (rowIndex == 0) {
							keys.put(cellIndex, cell.toString());
						} else {
							if (cellIndex < keys.keySet().size()) {
								String value = null;
								if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
									if (cell.toString().contains("-")) {
										Date d = cell.getDateCellValue();
										value = sdf.format(d);
									} else {
										value = (((Double) cell.getNumericCellValue()).intValue()) + "";
									}
								} else {
									value = cell.toString();
								}
								cells.put(keys.get(cellIndex), value);
							}
						}
					}
				}
				if (rowIndex != 0) {
					sheetValues.add(cells);
				}
			}
			result.add(sheetValues);
		}
		return result;
	}
}