package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSexecutorDemo {
//IF we get element intercepted exception we use javascript execu
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	WebElement elem = driver.findElement(By.xpath("//input[@id='name']"));
	 
	
	//Alternative of sendkeys method
	JavascriptExecutor js =(JavascriptExecutor) driver; //typecasting
	js.executeScript("arguments[0].setAttribute('value','sashank')",elem);//Alternative of sendkeys method
	
	
	//Alternative of click method
	WebElement elem1 = driver.findElement(By.xpath("//input[@id='male']"));
	js.executeScript("arguments[0].click()",elem1);
	}

}
