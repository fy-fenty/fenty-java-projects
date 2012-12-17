package org.fengyao.test;

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
import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.usermodel.SlideShow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		try {
			t.createNewPPT("D:\\C5.ppt", "D:\\C5.ppt", "D:\\C6.ppt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void createNewPPT(String excelPath, String pptPath, String outPath) throws IOException {
		List<Map> excelValues = this.getValuesByExcel(excelPath);
		for (int i = 0; i < excelValues.size(); i++) {
			Map m = excelValues.get(i);
		}
		InputStream is = new FileInputStream(pptPath);
		SlideShow ss1 = new SlideShow(is);
		Slide s1 = ss1.getSlides()[0];
		Shape[] s = s1.getShapes();
		Slide s2 = ss1.createSlide();
		for (Shape shape : s) {
			s2.addShape(shape);
		}
		OutputStream os = new FileOutputStream(outPath);
		ss1.write(os);
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
			if (row.getCell(0) == null) {
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