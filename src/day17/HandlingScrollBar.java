package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll down by pixel number
		//js.executeScript("window.scrollBy(0,3000)","");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll down till visiblity
		//WebElement elem = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		//js.executeScript("arguments[0].scrollIntoView();",elem);
		//System.out.println(js.executeScript("return window.pageYOffset;"));

		//scroll down till end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeAsyncScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		
		//scroll up 
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
	}

}
