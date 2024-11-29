package day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handExplicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wai = new WebDriverWait(driver,Duration.ofSeconds(5)); // explicit
		driver.get(("https://the-internet.herokuapp.com/javascript_alerts"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		Alert myLa = wai.until(ExpectedConditions.alertIsPresent());
		System.out.println(myLa.getText());
		myLa.accept();
	}

}
