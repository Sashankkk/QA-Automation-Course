package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select
		
		WebElement drp = driver.findElement(By.xpath("//select[@id='country']"));
		Select dr = new Select(drp);
		
		//select option from drop down
		//dr.selectByVisibleText("India");
		//dr.selectByValue("uk");
		//dr.selectByIndex(0);
		
		//capture the options from dropdown
		
		List<WebElement>options= dr.getOptions();
		System.out.println(options.size());
	
		//printing the option
//		for(int i=0;i<options.size();i++) {
//			System.out.println(options.get(i).getText());
//		
//		}
	
		
		//enhanced loop
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		
	}

	
}
