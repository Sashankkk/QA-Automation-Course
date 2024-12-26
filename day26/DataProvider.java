package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProvider {

	WebDriver driver;
	@BeforeClass
	void setup() {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	@Test(dataProvider="dp")
	void TestLogin(String email, String pwd) throws InterruptedException{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
	}
	
	
	@AfterClass
	void tearDown() 
	{
		driver.close();
	}
	

	@org.testng.annotations.DataProvider(name="dp",indices= {0,2})
	Object[][] loginData ()
	{
		Object data[][]=
			{
			{"abc@gmail.com","test123"},
			{"sashank_pandey20@yahoo.com","1234"},
			{"abc@gmail.com","1233"},
			};
			return data;
		}
	
}

