package day18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		String titles = driver.getTitle();
		if(titles.equals("Your Store")){
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}

}
