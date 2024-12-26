package day24;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation3 {
	@BeforeTest
	void login() {
		System.out.println("Login");
	}
	@Test(priority=0)
	void search() {
		System.out.println("Searching");
	}
	@Test(priority=1)
	void advanceSearch() {
		System.out.println("Adv search");
	}
	@AfterTest
	void logout() {
		System.out.println("Logout");
	}
}
