package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	//constructor
	LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	//Locator
	By Uname_Loc = By.xpath("//input[@placeholder='Username']");
	By Upass_Loc = By.xpath("//input[@placeholder='Password']");
	By Btn_Loc = By.xpath("//button[@type='submit']");
	
	
	//Action Methods
	
	public void setUName(String user) {
		driver.findElement(Uname_Loc).sendKeys(user);
	}
	
	public void setPw(String pwd) {
		driver.findElement(Upass_Loc).sendKeys(pwd);
		
	}
	
	public void click() {
		driver.findElement(Btn_Loc).click();
	}
}
