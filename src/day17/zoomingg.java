package day17;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoomingg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

//		driver.manage().window().minimize();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.body.style.zoom='10%'"); //set zoom level
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='80%'"); //set zoom level
		Thread.sleep(3000);
	}

}
