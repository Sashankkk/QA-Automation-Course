package day22;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	private static CharSequence pric;
	private static CharSequence roi;
	private static CharSequence per1;
	private static String per2;
	private static String fre;
	private static String mava;

	public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
	driver.manage().window().maximize();
		
	String filepath = System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";
	
	int rows = UserDefinedmethods.getRowCount(filepath, "Sheet1");
	
	int i;
	for(i=1;i<=rows;i++) {
		
		//read data from excel
		String pric = UserDefinedmethods.getcellData(filepath, "Sheet1", i, 0);
		String roi = UserDefinedmethods.getcellData(filepath, "Sheet1", i, 1);
		String per1 = UserDefinedmethods.getcellData(filepath, "Sheet1", i, 2);
		String per2 = UserDefinedmethods.getcellData(filepath, "Sheet1", i, 3);
		String fre = UserDefinedmethods.getcellData(filepath, "Sheet1", i, 4);
		String mava = UserDefinedmethods.getcellData(filepath, "Sheet1", i, 5);
	
	
	//pass above data in app
	driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
	driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
	driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
	
	Select per2drp = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
	per2drp.selectByVisibleText(per2);
	
	Select fredrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
	fredrp.selectByVisibleText(fre);
	
	driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
	
	//validation
	String act_mava = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
	
	if(Double.parseDouble(mava)==Double.parseDouble(act_mava)) {
		System.out.println("Passed");

		UserDefinedmethods.setCellData(filepath, "Sheet 1", i, 7, "Passed");
		UserDefinedmethods.fillGreenColor(filepath, "Sheet 1", i, 7);
		
	}
	
	else {
		
		System.out.println("Failed");
		UserDefinedmethods.setCellData(filepath, "Sheet 1", i, 7, "Failed");
		UserDefinedmethods.fillRedColor(filepath, "Sheet 1", i, 7);
	}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='PL5']")).click();
		
	}	//ending of loop
		
	driver.quit();

}
}
