package sampleprogram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoi {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C://Installations//poi-bin-4.1.1-20191023//poi-4.1.1/Credintials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Data");
		XSSFRow row =sheet.getRow(0);
		int colcount = row.getLastCellNum();
		System.out.println("total no of colums in excel sheet is: " +colcount);
		
		int rowcount = sheet.getLastRowNum() + 1;
		System.out.println("total no of rows in excel sheet is: " + rowcount);
		
		

	}

	
}
