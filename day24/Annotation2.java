package day24;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotation2 {

	@BeforeClass
	void login() {
		System.out.println("Login");
	}
	@AfterClass
	void logout() {
		System.out.println("Logout");
	}
	@Test
	void search() {
		System.out.println("Search");
	}
	@Test(priority=1)
	void advsearch() {
		System.out.println("Advance Search");
	}
	
	
}
