package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		//Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
//open url https:\\demo.opencart.com/

		driver.get("https:\\\\demo.opencart.com");

		//validate title
		
		String act_title = driver.getTitle();
		if(act_title.equals("Your Store"))
		{
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		//driver close
		driver.quit();
		
	}

}
