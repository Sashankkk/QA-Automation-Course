package day25;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency {
	WebDriver driver;
	@Test(priority=1)
	void openapp() {
	
		Assert.assertTrue(false);
		
	}
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login() {
		Assert.assertTrue(true);
		
}
	@Test(priority=3,dependsOnMethods= {"login"})
	void search() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=4,dependsOnMethods= {"openapp"})
	void adva() {
		Assert.assertTrue(true);
	}
	@Test(priority=5,dependsOnMethods= {"openapp"})
	void logout() {
		Assert.assertTrue(true);
	}
}
