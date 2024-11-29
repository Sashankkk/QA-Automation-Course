package day18;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class captureScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Full Page SceenShot
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File TargetFile = new File("C:\\Users\\sasha\\eclipse-workspace\\Automation Testing\\webdriver project\\Ss");
		sourceFile.renameTo(TargetFile);
		
		//Specific area of page Screenshot
		
//		WebElement elems = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//		File sourceFile = elems.getScreenshotAs(OutputType.FILE);
//		File targetFile = new File("C:\\Users\\sasha\\eclipse-workspace\\Automation Testing\\webdriver project\\Ss\\sec.png");
//		sourceFile.renameTo(targetFile);
		
		//Capture SS of WebElement
		WebElement ele = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File srcFile = ele.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("C:\\Users\\sasha\\eclipse-workspace\\Automation Testing\\webdriver project\\Ss\\logo.png");
		srcFile.renameTo(DestFile);		
		driver.quit();
		
	
		
		
		
	
	
	
	
	
	
	
	
	
	}

}
