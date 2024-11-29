package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictable {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//number of rows
	int row=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	System.out.println("Rows:" + row);
		
		//ros by tagname
//		int numbes=driver.findElements(By.tagName("tr")).size();
//		System.out.println("New Rows:" + numbes);
//		
		//number of column
	int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	System.out.println("Columns:" + cols);
		
		//single table tagname
		
//		int cols=driver.findElements(By.tagName("th")).size();
//		System.out.println("Columns by tagname:" + cols);
		
	String part = driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[3]")).getText();
	System.out.println(part);
	
	
	System.out.println("BookName" + "\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
	//retrieving data except 1st row
	
	for(int r=2;r<=row;r++) 
	{
		
	for(int c=1;c<=cols;c++) {
		String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
		System.out.println(value+"\t");
	}
	System.out.println();
	}
	

	//print book which is written by mukesh
	 for(int r=2;r<=row;r++){
	String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
	if(author.equals("Mukesh")) {
	String BookName	=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
		System.out.println(BookName+""+author);
	}
		 
	 }
//	
	int total = 0;
	 //total price of all book
	 for(int r=2;r<=row;r++){
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			System.out.println(price);
			total = total + Integer.parseInt(price);
			System.out.println("Total:"+total);
			

}}}