package day24;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation1 {

	@BeforeMethod
	void login() {
		System.out.println("Login");
	}
	
	
	@Test
	void search() {
		System.out.println("Search");
	}
	@Test(priority=1)
	void advsearch() {
		System.out.println("Advance Search");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("Logout");
	}
	
	
	
	
	
	
	
}
