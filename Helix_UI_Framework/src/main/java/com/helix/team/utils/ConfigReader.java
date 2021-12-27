package com.helix.team.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigReader {
	
	private Properties prop;
	private String cellValue = null;
	/*
	 * Author: Rajesh Matadh
	 * Purpuse: This method is used to get values from config file
	 */
	public Properties initiateProp()
	{
		prop = new Properties();
		try {
			FileInputStream fileip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(fileip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public String getValueFromExcel(int rowNum, int colNum) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Helix_UI_POC\\Helix_UI_Framework\\src\\test\\resources\\TestData\\Helix_Proj_Admin_Test_Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(colNum);
		System.out.println(cell);
		cellValue = sheet.getRow(rowNum).getCell(colNum).toString();
		return cellValue;
	}
	
	
}
