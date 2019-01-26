package com.AmazonTest.qa.TestUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testUtility {
	
	public void readFile() throws IOException {
		String filePath = "C:\\Users\\rarjunaraja\\Documents\\AmazonTest.xlsx";
		FileInputStream fis  = new FileInputStream("filepath");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("TestData");
		String text = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println("text");
		
	}
	
	
	}

