package day28;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
//Using PageFactory 
	WebDriver driver;
	
	//constructor
	LoginPage2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement Uname_Loc;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Upass_Loc;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Btn_Loc;
	
	
	//MULTIPLE LINK LOCATING
	@FindBy(tagName="a")
	List<WebElement> link;
	
	
	//Actions
	
	public void setUName(String user) {
		Uname_Loc.sendKeys(user);
	}
	public void setUPass(String pwd) {
		Upass_Loc.sendKeys(pwd);
	}
	public void clickLogin() {
		Btn_Loc.click();
	}
	

}
