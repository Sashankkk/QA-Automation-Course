package day21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingDynamicData {

	public static void main(String[] args) throws IOException {
	FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Dynamic Data");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Rows?");
		int noOfRows = sc.nextInt();
		
		System.out.println("How many Cells?");
		int noOfcells = sc.nextInt();
		
		for(int r=0;r<=noOfRows;r++) {
			XSSFRow currentRow = sheet.createRow(r);
		
		for(int c=0;c<=noOfcells;c++) {
			XSSFCell cell = currentRow.createCell(c);
			cell.setCellValue(sc.nextInt());
		}
		
		}
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("Created");
	}

}
