package day15;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkinNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

	WebElement reg =	driver.findElement(By.xpath("//a[@class='ico-register']"));
	Actions act = new Actions(driver);
	//Ctrol + Reglink
	act.keyDown(Keys.CONTROL).click(reg).keyUp(Keys.CONTROL).perform();
	
	//switch to reg page
	List<String> ids = new ArrayList<String>(driver.getWindowHandles());
	
	//Registration
	driver.switchTo().window(ids.get(1));
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sashank");
	
	//Home page
	driver.switchTo().window(ids.get(0));
	driver.findElement(By.xpath("//input[@id='small-searchitems']")).sendKeys("Tshirts");
	
	
	
	
	}

}
