package day21;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("welcome");
		row1.createCell(1).setCellValue(1234);
		row1.createCell(2).setCellValue("Automation");
	
		XSSFRow row2 = sheet.createRow(1);
		row1.createCell(0).setCellValue("php");
		row1.createCell(1).setCellValue(1232);
		row1.createCell(2).setCellValue("Automation engineer");
	
		XSSFRow row3 = sheet.createRow(2);
		row1.createCell(0).setCellValue("welcome");
		row1.createCell(1).setCellValue(1234);
		row1.createCell(2).setCellValue("Automation");
	
		XSSFRow row4 = sheet.createRow(3);
		row1.createCell(0).setCellValue("phps");
		row1.createCell(1).setCellValue(1232);
		row1.createCell(2).setCellValue("Autwwwomation engineer");
	
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("created");
	}

}
