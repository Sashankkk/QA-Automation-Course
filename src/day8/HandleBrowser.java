package day8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary']")).click();
		Set <String> windowID = driver.getWindowHandles();
		
		//approach 1
		
//		List<String> windoList=new ArrayList(windowID);
//		String pId= windoList.get(0);
//		String cId = windoList.get(1);
//		
//		driver.switchTo().window(cId);
//		System.out.println(driver.getTitle());
//	
//		driver.switchTo().window(pId);
//		System.out.println(driver.getTitle() );
		
		
		//Approach 2 if there are multiple web page it is used
//		for(String wId:windowID) {
//			
//			String title=driver.switchTo().window(wId).getTitle();
//			if(title.equals("Automation Testing Practice")) {
//				System.out.println(driver.getCurrentUrl());
//			}
//		}
//		driver.close();
		
		
		for(String wId:windowID) {
			String title = driver.switchTo().window(wId).getTitle();
			System.out.println(title);
			if(title.equals("Automation Testing Practice")) {
				driver.close();
				
			}
			
			
		}
	
	}

}
