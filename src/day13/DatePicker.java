package day13;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
//	static void selectFutureDate(WebDriver driver,String month, String year,String date) {
//		
//		//select month and year
//		while(true) {
//			String currmonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//			String curryear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//			if(currmonth.equals(month) && curryear.equals(year)) {
//				break;
//	}
//		
//	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//		}
//		
//		
//		List <WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
//		for(WebElement dt:allDates) {
//			if(dt.getText().equals(date)) {
//				dt.click();
//				break;
//			}
//		}
//	}
//		
		
		
		
	//past
	static void selectPastDate(WebDriver driver,String month, String year,String date) {
		
		//select month and year
		while(true) {
			String currmonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String curryear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currmonth.equals(month) && curryear.equals(year)) {
				break;
	}
		
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		
		List <WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		for(WebElement dt:allDates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
	
		}
	}
		
	//past
		
		


	
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//using send keys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");
		

		//method datepicker
		//expected data
//		String year = "2025";
//		String month = "October";
//		String date = "28";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	
		//selectFutureDate(driver,"2025","April","28");
		selectPastDate(driver,"2002","April","28");
		
	}
}

