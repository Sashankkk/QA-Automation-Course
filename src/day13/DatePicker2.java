package day13;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker2 {
	
		static Month convertMonth(String month) {
		HashMap <String,Month> monthMap = new HashMap<String,Month>();
		monthMap.put("January", Month.JANUARY);
		monthMap.put("January", Month.FEBRUARY);
		monthMap.put("January", Month.MARCH);
		monthMap.put("January", Month.APRIL);
		monthMap.put("January", Month.MAY);
		monthMap.put("January", Month.JUNE);
		monthMap.put("January", Month.JULY);
		monthMap.put("January", Month.AUGUST);
		monthMap.put("January", Month.SEPTEMBER);
		monthMap.put("January", Month.OCTOBER);
		monthMap.put("January", Month.NOVEMBER);
		monthMap.put("January", Month.DECEMBER);
		
		Month vmonth = monthMap.get(month);
		if(vmonth == null) {
			System.out.println("Invalid");
		}
		return vmonth;
		}
		static void selectDate(WebDriver driver, String requiredYear,String requiredMonth, String reqdate) {
		
			//select year
			WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Select selectYear = new Select(yearDropDown);
			
			//select month
			
			while (true)
			{
				String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				
				//convertreq month and display month in month bject
				Month eM = convertMonth(requiredMonth);
				Month cM = convertMonth(displayMonth);
				
				//compare
				
				int result = eM.compareTo(cM);
				
				if(result<0) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
					
				}
				
				if(result>0) {
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
						
					}
				else {
					break;
				}
			}
		//date selection
			
			List <WebElement> dates = driver.findElements(By.xpath("//table[@class='ui datepicker-calender']//tbody//tr//td//a"));
			
			for(WebElement ob:dates) {
				if(ob.getText().equals(reqdate))
				{
					ob.click();
				}
			}
			
		

	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpracticeblogspot.com/");
		driver.manage().window().maximize();
		//input dob
		

		String reqYear = "2022";
		String reqMonth = "June";
		String reqDate = "15";
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@class='icon-calendar']")).click();
		
		//select year
		selectDate(driver,reqYear,reqMonth,reqDate);
		
		
	

		
		
		
		
		

	}

}
