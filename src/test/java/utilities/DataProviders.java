package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviders {

	  public void fileInput() throws IOException {
		  FileInputStream input = new FileInputStream("C:\\Users\\Asus\\Downloads\\UNandPW.xlsx"); 
			XSSFWorkbook wb = new XSSFWorkbook(input);
			XSSFSheet sheet = wb.getSheetAt(0);
			XSSFRow row = sheet.getRow(6);
			String cell = row.getCell(0).getStringCellValue();
			String cell1 = row.getCell(1).getStringCellValue();
	  }
		
		
	
}
