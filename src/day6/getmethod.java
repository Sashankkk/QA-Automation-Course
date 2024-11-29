package day6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	//Get URL
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	
	//Get Title
	String title = driver.getTitle();
	System.out.println(title);
	
	//getCurrentUrl
	System.out.println(driver.getCurrentUrl());
	
	
	//GET PAGE SOURCE
	System.out.println(driver.getPageSource());
	
	//Get window handle
	System.out.println(driver.getWindowHandle());
	
	//GET WINDOW HANDLES
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	Set <String> windowsids = driver.getWindowHandles();
	System.out.println(windowsids);
	driver.close();
	}

}
