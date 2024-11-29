package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.xpath("]"));
		uname.clear();
		uname.sendKeys("demo");
		
		WebElement pass = driver.findElement(By.xpath(""));
		pass.clear();
		pass.sendKeys("demo");
		
		driver.findElement(By.xpath("")).click();
		
		
	}

}
