package com.AmazonTest.qa.TestUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public Iterator<Object[]> readFile() throws IOException {
		String filePath = "C:\\Users\\rarjunaraja\\Documents\\AmazonTest.xlsx";
		FileInputStream fis  = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("TsetData");
	    List<Object[]> data = new ArrayList<>();
		for(int r = 1; r<= sheet.getLastRowNum(); r++) {
			String columnValue = sheet.getRow(r).getCell(0).getStringCellValue();
			System.out.println(columnValue);
		    data.add(new String[]{columnValue});
		}
	    return data.iterator();
	}
	
	public static void main(String[] args) throws IOException {
		ExcelUtil eu = new ExcelUtil();
		eu.readFile();
	}
}

