package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoardActions {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Radhe");
		
		Actions act = new Actions(driver);
		
		//ctrl + a selecting all 
		
		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
	
		//ctrl + c copying them
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		
		//tab shifting to other tab2
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		
		//ctrl+v pasting the text	
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
