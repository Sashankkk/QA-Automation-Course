package day15;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoNewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opencart.com/");
		//driver.switchTo().newWindow(WindowType.TAB); //OPEN NEW TAB
		
		driver.get("https://orangehrm.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.manage().window().maximize();
	}

}
