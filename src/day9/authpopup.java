package day9;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class authpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//syntax 
		// http://username:password@the-internet.herokuapp.com/basic_auth
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic-auth");
		driver.manage().window().maximize();
		
	}

}
