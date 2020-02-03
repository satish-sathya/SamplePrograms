package sampleprogram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\satish sathya\\workspace\\sampleprogram\\"
				+ "src\\ExcelFile\\userdata.xlsx");
//		FileInputStream fis = new FileInputStream("F:\\userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		Sheet s1 = w1.getSheet("Sheet1");
		Row r1 = s1.getRow(2);
		Cell c1 = r1.getCell(2);
		String s = c1.getStringCellValue();
		System.out.println(s);
		
	}

}
