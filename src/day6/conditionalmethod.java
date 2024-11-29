package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalmethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//isDisplayed
//		WebElement logo = driver.findElement(By.xpath("//img[@title='OpenCart - Contact']"));
//		System.out.println(logo.isDisplayed());
//		
		//isEnabled
		//boolean name = driver.findElement(By.xpath("//button[@id='button-send']")).isEnabled();
		//System.out.println("Is it enable?"+name);
//		WebElement male = driver.findElement(By.xpath("//input[@id='male']"));
//		System.out.println("Is male selected:"+ male.isEnabled());
//		
//		WebElement female = driver.findElement(By.xpath("//input[@id='female']"));
//		System.out.println("female::" + female.isEnabled());
//		
		
		//isSelected
		WebElement male = driver.findElement(By.xpath("//input[@id='male']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='female']"));
		System.out.println("Before Selection:");
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		System.out.println("After Selecting Male Radio:");
		male.click(); // it will click male radio 
		System.out.println(male.isSelected());
		
		System.out.println("After selecting female radio");
		female.click();
		System.out.println(female.isSelected());
		System.out.println(male.isSelected());
		
		
		driver.findElement(By.linkText("merrymoonmary")).click();
		Thread.sleep(5000);
//driver.close();
		driver.quit();
		//browser 
		
	}

}
