package day2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class day2Locators {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://demo.opencart.com/");
//window maximize garcha browser ko
driver.manage().window().maximize();

//TO FIND A SINGLE ELEMENT

//name
//driver.findElement(By.name("search")).sendKeys("Iphone");
//
////id
//boolean logoDisplaystatus = driver.findElement(By.id("logo")).isDisplayed();
//System.out.println(logoDisplaystatus);
//
////linkedtext and partiallinked text
//driver.findElement(By.linkText("Cameras")).click();
//driver.findElement(By.partialLinkText("Came")).click();

//TO FIND GROUP OF ELEMENTS

//classname
List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
System.out.println("total number of header links are"+headerLinks.size());

//tagname

List<WebElement> links = driver.findElements(By.tagName("a"));
System.out.println("total number of links" + links.size());


//to find the total number of images

List<WebElement> images = driver.findElements(By.tagName("img"));
	System.out.println("total number of images are"+images.size());



	}
}

 