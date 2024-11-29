package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chekbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//select all checkbox
List <WebElement> cb = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

//for(WebElement checkboxes:cb) {
//	checkboxes.click();
//}
//	
//select last 3 checkbox
//	for(int i=4;i<cb.size();i++) {
//		cb.get(i).click();
//		
//	}
	
	//select first 3 check box
	
//	for(int i=0;i<3;i++) {
//		cb.get(i).click();
//	}

	//unselect checkboxes
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	//select 3 cb
	for(int i=0;i<3;i++) {
		cb.get(i).click();
	}
	Thread.sleep(5000);
	
	//unselect 3 cb
	for(int i=0;i<cb.size();i++) {
		if(cb.get(i).isSelected()) {
			cb.get(i).click();
		}
	}
	
	
	
	
	
	
	}

}
