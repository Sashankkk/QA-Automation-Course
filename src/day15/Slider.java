package day15;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	driver.manage().window().maximize();
	
	Actions act = new Actions(driver);
	
	//Min Slider
	
//	WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
//	System.out.println("Location of min slider:" + min_slider.getLocation());//(59,250)
//	act.dragAndDropBy(min_slider, 100 ,232).perform();
//	System.out.println("After moving" + min_slider.getLocation()); //(86,232)

	//Max Slider
	
	WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
	System.out.println("Location of max slider:" + max_slider.getLocation());//(612,288)
	act.dragAndDropBy(max_slider, -100 ,288).perform(); //--reducing the x axis 
	System.out.println("After moving" + max_slider.getLocation()); //(512,288)

	
	}
}
