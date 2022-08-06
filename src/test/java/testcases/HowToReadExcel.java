package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;

public class HowToReadExcel {
	
	@Test
	
	public void readExcel() throws IOException{
		
		File file = new File (".\\src\\test\\resources\\Property File.xls");
		FileInputStream fis = new FileInputStream(file);
		
		//xlsx-XSSF Workbook
		HSSFWorkbook hssWorkbook = new HSSFWrkbook (fis);
		
		// xlxx-XSSFSheet
		HSSFSheet sheet= hssfWorkbook("Sheet1");
		
		
		int lastrowNum = sheet.getLastRowNum();
		for (int i =1; i<=1 lastrowNUm; i++) {
		
			//xlsx-XSSFRow
			HSSFRow row = sheet.getROW(i);
			int laastCellNum = row.getLastCellNum();
			
			for( int j= 0; j<lastCellNum; j++) {
				System.out.println(row.getCell(j).getStringCellValue()+":");
			}
			System.out.println();
		}
		
		
}
}