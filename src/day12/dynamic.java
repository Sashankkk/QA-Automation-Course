package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {

	public static void main(String[] args) throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("\"https://demo.opencart.com/admin/");
	driver.manage().window().maximize();
	
	WebElement uname = driver.findElement(By.xpath("//input[@id='input-username'"));
	uname.clear();
	uname.sendKeys("demo");
	
	WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
	password.clear();
	password.sendKeys("demo");

	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
	//close window if avai
	
	if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()){
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
	}
	
	//click customer main menu
	
	driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
	driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
	
	//showing 1 to 10
	String text=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
	int tp = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
	
	for(int p=1;p<=tp;p++) {
		if(p>1) {
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
			active_page.click();
			Thread.sleep(3000);
		}
			int noRow = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			for(int r=1;r<=noRow;r++) {
				String name = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
				String email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
		
				String status= driver.findElement(By.xpath("//table[@class='table' table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
			
			System.out.println(name+" "+email+" "+status);
			}
		}
	}
	
	
	
	
	}

