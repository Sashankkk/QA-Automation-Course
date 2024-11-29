package day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get(("https://the-internet.herokuapp.com/javascript_alerts"));
		//driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		Thread.sleep(5000);
//		
//		//handling normal alert window
//		Alert myl = driver.switchTo().alert();
//		System.out.println(myl.getText());
//		myl.accept();
		
		//confirmation alert
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();//close alert using ok button
		driver.switchTo().alert().getText(); //return the text
		//driver.switchTo().alert().dismiss(); //close alert using close button

		
	}

}
