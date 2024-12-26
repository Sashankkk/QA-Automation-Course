package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHrm {

	WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		}
	
	
	@Test(priority=1)
	void logoVisible() {
		boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logo, true);
		}
	
	@Test(priority=2)
	void testUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensorce-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=3,dependsOnMethods= {"testUrl"})
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void tear() {
		driver.quit();
	}
}
