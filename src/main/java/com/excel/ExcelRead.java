package com.excel;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/Files/TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int noOfSheets = workbook.getNumberOfSheets();
		for (int i = 0; i < noOfSheets; i++) {
			XSSFSheet sheet = workbook.getSheetAt(i);
			String sheetName = sheet.getSheetName();
			if (sheetName.equalsIgnoreCase("TestCases")) {
				System.out.println(sheet.getLastRowNum());
				Iterator<Row> rows = sheet.rowIterator();
				Row firstRow = rows.next();
				System.out.println(firstRow.getLastCellNum());
				Iterator<Cell> cell = firstRow.cellIterator();
				int k = 0;
				int column = 0;
				while (cell.hasNext()) {
					Cell value = cell.next();
					if (value.getStringCellValue().equals("TestCases")) {
						column = k;
						
						if(value.getStringCellValue().equalsIgnoreCase("TestCase2"))
						{
							System.out.println(value);
						}
					}
					k++;
				}
			}

		}
	}
}
