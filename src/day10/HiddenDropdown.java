package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/dashboard/index");
		driver.manage().window().maximize();
		//login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//pim
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		//dropdown
		driver.findElement(By.xpath("//div[7]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		Thread.sleep(5000);
		//select single option
		//driver.findElement(By.xpath("//span[normalize-space()='OrangeHRM']")).click();
		
		//number of element
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='option']/span"));
		System.out.println(options.size());
		
		//printing option
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		
	}
	

}
