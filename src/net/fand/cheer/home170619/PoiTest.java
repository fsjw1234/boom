package net.fand.cheer.home170619;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class PoiTest {
	public static void main(String[] args) throws Exception {
		
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("test");
		
		HSSFRow row=sheet.createRow(1);
		HSSFCell cell=row.createCell(1);
		cell.setCellValue("hello world");
		
		workbook.write(new FileOutputStream("E:/test/test/test.xls"));
		
	}

}
