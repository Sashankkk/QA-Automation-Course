package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		//dd1
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='box107']"));
		
		act.dragAndDrop(rome, italy).build().perform();
		
		//dd2
		WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement seoul  = driver.findElement(By.xpath("//div[@id='box101']"));
		
		act.dragAndDrop(oslo,seoul).build().perform();
		
	}

}
