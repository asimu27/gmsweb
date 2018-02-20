package com.pacom.gmsweb.helpers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;

import static com.pacom.gmsweb.tests.BaseTestSuite.testDataExcelFileName;;

public class ExcelHelpers {

	//Get current directory of the project
	public static final	String currDir = System.getProperty("user.dir");
	
	//Get the excel file path
	public static String testDataExcelFilePath = null;
	
	private static XSSFWorkbook excelWBook;
	
	private static XSSFSheet excelWSheet;
	
	private static XSSFCell cell;
	
	private static XSSFRow row;
	
	public static int rowNumber;
	
	public static int columnNumber;
	
	public static void setrowNumber(int pRowNumber) {
		
		rowNumber = pRowNumber;
		
	}
	
	public static int getrowNumber()
	{
		
		return rowNumber;
	}
	
	
	public static void setColNumber(int pColumnNumber) {
		
		columnNumber = pColumnNumber;
		
	}
	
	
	public static int colNumber() {
		
		return columnNumber; 
	}
	
	public static void setExcelFileSheet(String sheetName) throws Exception
	{
		
		if(Platform.getCurrent().toString().equalsIgnoreCase("WIN")) {
			testDataExcelFilePath = currDir + "\\datasets\\";
			
			try {
				
				FileInputStream ExcelFile = new FileInputStream(testDataExcelFilePath + testDataExcelFileName);
				excelWBook = new XSSFWorkbook(ExcelFile);
				excelWSheet = excelWBook.getSheet(sheetName);
			}catch(Exception e)
			{
				try {
				throw (e);
				}catch(IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
	public static XSSFRow getRowData(int rowNum) throws Exception
	{
		
		try {
			
			row = excelWSheet.getRow(rowNum);
			return row;
		}catch(Exception e) {
			
			throw(e);
		}
	}
	
	public static void setCellData(String value, int rowNum, int colNum)
	{
		try { 
			
			row = excelWSheet.getRow(rowNum);
			cell = row.createCell(colNum);
			if(cell==null)
			{
				
				cell = row.createCell(colNum);
				cell.setCellValue(value);
			}else {
				
				cell.setCellValue(value);
			}
			FileOutputStream fileOut = new FileOutputStream(testDataExcelFilePath + testDataExcelFileName);
			excelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
			
		}catch(Exception e)
		{
			
			try {
				
				throw(e);
			}catch(Exception e1) {
				
				e1.printStackTrace();
			}
			
		}
		
	}
	
	
	
	

	
	
}
