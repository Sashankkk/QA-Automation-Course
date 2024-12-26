package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
	
	WebDriver driver;
	
  @Test(priority=1)
  public void openapp() {
	driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 
  driver.manage().window().maximize();
  }
  
  @Test(priority=2)
  void logo() throws InterruptedException {
	  Thread.sleep(3000);
	 boolean logos = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	 System.out.println("logo is present?"+logos);
  }
  
  @Test(priority=3)
  void login() {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  
  }
  @Test(priority=4)
   void closeapp() {
	  driver.close();
  
  }
}
