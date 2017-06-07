package net.fand.cheer.demo.ch16;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class PoiTest {

	public static void main(String[] args) throws Exception {
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("POI TEST");
		
		HSSFRow row=sheet.createRow(1);
		HSSFCell cell=row.createCell(1);
		cell.setCellValue("hello poi");
		
		workbook.write(new FileOutputStream("F:/test/1.xls"));
		
	}

}
