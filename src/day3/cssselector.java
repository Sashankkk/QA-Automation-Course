package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	
	//tag id
driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Pants");

	
	//tag and class
driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Radhe");
	
	//tag and attribute
	 
	driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Sashank");
	
	//tag,class and attribute
	driver.findElement(By.cssSelector("input[.search-box-text[name='q']]")).sendKeys("Sashank");
	
	}

}
