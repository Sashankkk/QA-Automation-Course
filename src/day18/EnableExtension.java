package day18;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtension {
//BLOCK AD IN AUTOMATION 
	public static void main(String[] args) {
		
		ChromeOptions op = new ChromeOptions();
		File file = new File("C:\\Automation Testing\\AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx");
		op.addExtensions(file);
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://text-compare.com/");
		
	}

}
