package com.free.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TestUtil extends SetupDriver {

	static FileInputStream FRead;
	static FileOutputStream FWrite;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	static int rowval,rowcount;
	static String xlpath = "C:\\Users\\EADKUMAR\\OneDrive - Capgemini\\exceldatafreecrm.xlsx";
	static String screen_path = "C:\\Users\\EADKUMAR\\trial\\FreeCRMtrial\\screenshots\\";
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(prop.getProperty("sc_path")));
	}
	
	public static void assertmethod(String actual) throws Exception {
		//FRead = new FileInputStream(prop.getProperty("excelpath"));
		FRead = new FileInputStream(xlpath);
		wb = new XSSFWorkbook(FRead);
		//FWrite=new FileOutputStream(prop.getProperty("excelpath"));
		FWrite=new FileOutputStream(xlpath);
		sh = wb.getSheet("AssertMethod");
		rowcount = sh.getPhysicalNumberOfRows();
		for(rowval=1;rowval<rowcount;rowval++) {
			sh.getRow(rowval).createCell(4).setCellValue(actual);
			wb.write(FWrite);
		}
	}
}
