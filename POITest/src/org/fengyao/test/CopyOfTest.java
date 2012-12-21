package org.fengyao.test;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

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
public class CopyOfTest {
	public static String imageName = "图片ID";

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException,
			IllegalAccessException {
		CopyOfTest t = new CopyOfTest();
		try {
			 t.createNewPPT("D:\\2.xls", "D:\\2.ppt", "D:\\22.ppt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void createNewPPT(String excelPath, String pptPath, String outPath) throws IOException,
			CloneNotSupportedException, InstantiationException, IllegalAccessException {
		List<Map> excelValues = this.getValuesByExcel(excelPath);
		InputStream is = new FileInputStream(pptPath);
		OutputStream os = new FileOutputStream(outPath);
		SlideShow ss1 = new SlideShow(is);
		/*
		 * 模板元素设置 Slide s = ss1.getSlides()[0]; TextBox tx = (TextBox)
		 * s.getBackground().getSheet().getShapes()[4];
		 * System.out.println(s.getBackground().getSheet().getShapes()[6]);
		 * AutoShape as = (AutoShape)
		 * s.getBackground().getSheet().getShapes()[6];
		 * System.out.println(as.getAnchor().y);
		 * System.out.println(tx.getText());
		 */
		Shape[] shs = ss1.getSlides()[0].getShapes();
		for (int i = 0; i < excelValues.size(); i++) {
			Map m = excelValues.get(i);
			System.out.println(m);
			Slide s2 = ss1.createSlide();
			for (Shape sh : shs) {
				// MyShape ms = ((MyShape)sh).getClone();
				if (sh.getShapeType() == ShapeTypes.TextBox && ((TextBox) sh).getText() != null) {
					String oldKey = ((TextBox) sh).getText();
					String key = oldKey.replaceAll("[:,：]$", "").replace(" ", "");
					if (m.keySet().contains(key)) {
						if (imageName.equals(key)) {
							String imgCurrentPath = pptPath.substring(0, pptPath.lastIndexOf("\\"));
							File f = new File(imgCurrentPath + File.separator + m.get(key));
							if (f.exists() && f.isFile()) {
								BufferedImage bi = ImageIO.read(f);
								Dimension imgSize = new Dimension(bi.getWidth(), bi.getHeight());
								Point imgLocation = sh.getAnchor().getLocation();
								if (bi.getWidth() > sh.getAnchor().width) {
									double sizePercent = sh.getAnchor().getWidth() / bi.getWidth();
									int imgHeight = (int) (bi.getHeight() * sizePercent);
									imgSize.setSize(sh.getAnchor().width, imgHeight);
								}
								sh = new Picture(ss1.addPicture(f, Picture.JPEG));
								sh.setAnchor(new Rectangle(imgLocation, imgSize));
							} else {
								((TextBox) sh).setText("");
							}
						} else {
							TextBox tx = new TextBox();
							RichTextRun rt = tx.getTextRun().getRichTextRuns()[0];
							TextBox tx_t = (TextBox) sh;
							RichTextRun rt_t = tx_t.getTextRun().getRichTextRuns()[0];
							rt.setFontSize(rt_t.getFontSize());
							rt.setFontName("微软雅黑");
							rt.setBold(rt_t.isBold());
							rt.setItalic(rt_t.isItalic());
							rt.setUnderlined(rt_t.isUnderlined());
							rt.setFontColor(rt_t.getFontColor());
							tx.setHorizontalAlignment(TextBox.AlignLeft);
							Dimension d = new Dimension(600, ((Double) sh.getAnchor().getHeight()).intValue());
							tx.setAnchor(new Rectangle(sh.getAnchor().getLocation(), d));
							tx.setText(oldKey + "\t" + m.get(key));
							sh = tx;
						}
					}
				}
				s2.addShape(sh);
			}
		}
		ss1.write(os);
		is.close();
		os.close();
	}

	public List<Map> getValuesByExcel(String path) throws IOException {
		List<Map> result = new LinkedList<Map>();
		InputStream is = new FileInputStream(path);
		Workbook wb = new HSSFWorkbook(is);
		Sheet sheet = wb.getSheetAt(0);
		Map keys = new HashMap();
		int rowIndex;
		int cellIndex;
		Row row;
		Map cells;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		for (Iterator<Row> rit = sheet.rowIterator(); rit.hasNext();) {
			row = rit.next();
			rowIndex = row.getRowNum();
			if (row.getCell(0) == null || row.getCell(0).toString().trim().equals("")) {
				break;
			}
			cells = new HashMap();
			for (Iterator<Cell> cit = row.cellIterator(); cit.hasNext();) {
				Cell cell = cit.next();
				cellIndex = cell.getColumnIndex();
				if (rowIndex == 0) {
					keys.put(cellIndex, cell.toString());
				} else {
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
			if (rowIndex != 0) {
				result.add(cells);
			}
		}
		return result;
	}
}