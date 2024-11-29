package day18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HEADLESS
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new"); //setting headless mode
		
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
