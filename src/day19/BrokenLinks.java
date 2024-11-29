package day19;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//capture all the link from website
		List<WebElement> elem = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links:" + elem.size());
			
		int noOfBL = 0;
		//reading all the link
			for (WebElement link:elem)
			{
				//capturing href value
				String hre = link.getAttribute("href");
				if(hre==null || hre.isEmpty()) {
					System.out.println("No value");
					continue;
			
			}
		
				//hit to url to a  server to get a status code
		try {
			URL linkURL = new URL(hre); //converting string to url
			HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection(); //open connection to server
			conn.connect();
			
			//Get status code
			
			if(conn.getResponseCode()>=400) {
				System.out.println(hre+":Broken Link");
				noOfBL++;
			}
			else {
				System.out.println("Normal Link");
			}
			}
		catch(Exception e) {
			
		}
		}
			
		System.out.println("Normal of broken links:"+noOfBL);
	}
}