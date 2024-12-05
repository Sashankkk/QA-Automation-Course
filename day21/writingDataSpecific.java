package day21;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;5
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingDataSpecific {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");

		XSSFRow row = sheet.createRow(2);
		XSSFCell cell = row.createCell(1);
		
		cell.setCellValue("Radhe");
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("Created");
		
	}

}
