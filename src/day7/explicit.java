package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); //DECLARATIOM
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement uname = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='textarea']")));
		uname.sendKeys("balaju");
		
		WebElement btn = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='FSsubmit']")));
		btn.click();
	
		
		
		
		
	}

}
