package org.fengyao.test;

import java.awt.Dimension;
import java.awt.Rectangle;
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

import org.apache.poi.hslf.model.Shape;
import org.apache.poi.hslf.model.ShapeTypes;
import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.model.TextBox;
import org.apache.poi.hslf.usermodel.SlideShow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

@SuppressWarnings( { "unchecked" })
public class Test {
	public static String imageName = "图片ID";

	public static void main(String[] args) throws IOException {
		Test t = new Test();
		String xlsPath = "D:\\1.xls";
		String pptPath = "D:\\1.ppt";
		String outPPTPath = "D:\\11.ppt";
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

	/*
	 * 背景模板元素设置 Slide s = ss1.getSlides()[0]; TextBox tx = (TextBox)
	 * s.getBackground().getSheet().getShapes()[4];
	 * System.out.println(s.getBackground().getSheet().getShapes()[6]);
	 * AutoShape as = (AutoShape) s.getBackground().getSheet().getShapes()[6];
	 * System.out.println(as.getAnchor().y); System.out.println(tx.getText());
	 */
	public void createNewPPT(String excelPath, String pptPath, String outPath) throws IOException {
		List<Map> excelValues = this.getValuesByExcel(excelPath).get(0);
		InputStream is = new FileInputStream(pptPath);
		OutputStream os = new FileOutputStream(outPath);
		SlideShow ss = new SlideShow(is);
		for (int i = 0; i < excelValues.size(); i++) {
			Shape[] shs = ss.getSlides()[0].getShapes();

			Slide s2 = ss.createSlide();
			Map m = excelValues.get(i);

			for (Iterator it = m.keySet().iterator(); it.hasNext();) {
				String m_key = it.next() + "";
				String val = m.get(m_key) + "";
				for (int j = 0; j < shs.length; j++) {
					if (shs[j].getShapeType() == ShapeTypes.TextBox) {
						TextBox tx = (TextBox) shs[j];
						if (tx != null && tx.getText() != null) {
							String oldKey = tx.getText();
							String tx_key = oldKey.replaceAll("[:,：]$", "").replace(" ", "");
							if (m_key.equals(tx_key)) {
								if (imageName.equals(m_key)) {
									// String imgPath = "D:\\1.jpg";
									// shs[j] = new Picture(ss.addPicture(new
									// File(imgPath), Picture.JPEG));
								} else {
									TextBox tx_t = new TextBox();
									tx_t.setText(oldKey + "\t" + val);
									int tx_width = tx_t.getText().getBytes("GBK").length * 10;
									Dimension tx_size = new Dimension(tx_width, tx.getAnchor().height);
									tx_t.setAnchor(new Rectangle(tx.getAnchor().getLocation(), tx_size));
									shs[j] = tx_t;
								}
								break;
							}
						}
					}
				}
			}
			for (Shape sh : shs) {
				s2.addShape(sh);
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