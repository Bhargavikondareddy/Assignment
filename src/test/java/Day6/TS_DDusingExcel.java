package Day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TS_DDusingExcel {
  @Test
  public void excelreader() throws IOException {
	  String result = null;
	  String path = "C:\\Users\\BhargaviK\\eclipse-workspace2\\Prj_SeleniumMVN\\src\\test\\resources\\Excel\\TestData.xlsx";
	  FileInputStream fis = new FileInputStream(path);
	  
	  //workbook
	  XSSFWorkbook workbook = new XSSFWorkbook(fis);
	  
	  //worksheet
	  XSSFSheet sheet = workbook.getSheetAt(0);
	  
	  //rowcount
	  int rowcount = sheet.getLastRowNum();
	  int colcount = sheet.getRow(1).getLastCellNum();
	  
	  System.out.println("Row count: " + rowcount);
	  System.out.println("Col count: " + colcount);
	  
	  //Read from excel
	  for(int i = 0; i<= rowcount; i++) {
		  XSSFRow row = sheet.getRow(i);
		  for(int j = 0; j< colcount; j++) {
			  XSSFCell cell = row.getCell(j);
			  result = cell.getStringCellValue();
			  System.out.println(result);
		  }
	  }
	  
	  //write into excel
	  FileOutputStream out = new FileOutputStream(path);
	  XSSFCell cell1 = sheet.getRow(2).createCell(4);
	  cell1.setCellValue(result);
	  workbook.write(out);
	  
	  //close wb
	  workbook.close();
	  
	  
	  
  }
}
