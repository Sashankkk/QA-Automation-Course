package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
			driver.manage().window().maximize();
			
			//XPATH WITH SINGLE ATTIBUTE
			//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("IPOD");
			
			//xpath with multiple attribute
			//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Sashank");
		
		 //xpath with and operator
			
			//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("nakin");
		
			//xpath with or operator 
			//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Searc']")).sendKeys("k kinchas");
		
			//xpath using innertext
			//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
			
//			boolean displaystatus = driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
//			System.out.println(displaystatus);
			
			//String ram = driver.findElement(By.xpath("//*[text()='Featured']")).getText();
			//System.out.println(ram);
			
			//xpath with contains locate the element
			//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Ram");
			
			//xpath with start with function
			//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("sawdw");
			
			//chained xpath
			boolean displaycha = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
			System.out.println(displaycha);
			
			}

}
