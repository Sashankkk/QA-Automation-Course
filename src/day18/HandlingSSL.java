package day18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingSSL {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.setAcceptInsecureCerts(true);
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
