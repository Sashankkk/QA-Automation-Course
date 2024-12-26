package day28;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	void TestLogin() {
		LoginPage LP = new LoginPage(driver);
		LP.setUName("Admin");
		LP.setPw("admin");
		LP.click();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
			
		
	}
	
	void Tear() {
		driver.close();
	}
}
