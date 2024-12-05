package day21;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingdata {

	public static void main(String[] args) throws IOException {
	//Reading mode
	FileInputStream file = new FileInputStream("C:\\Users\\sasha\\eclipse-workspace\\Automation Testing\\seleniumwebdrivers\\testdata\\test.xlsx");
	//Opening workbook
	XSSFWorkbook wb = new XSSFWorkbook(file);
	//opening sheet
	XSSFSheet sheet = wb.getSheet("Sheet1");
	//getting number of rows
	int TotalRows = sheet.getLastRowNum();
	
	int TotalCells = sheet.getRow(0).getLastCellNum();
	
	System.out.println(TotalRows);
	System.out.println(TotalCells);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	for(int r=0;r<=TotalRows;r++) {
		XSSFRow currRow = sheet.getRow(r);

		for(int c=0;c<=TotalCells;c++) {
			XSSFCell cell = currRow.getCell(c);
			System.out.println(cell.toString()+"\t");
		}
		System.out.println();
		
	}

	wb.close();
	file.close();
	
	
	
	}

	
	}

