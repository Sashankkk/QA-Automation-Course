package day25;

import org.testng.annotations.Test;

public class grouping {
	@Test(priority=1,groups= {"sanity"})
	void loginbyEmail() {
		System.out.println("Login by email");
	}
	@Test(priority=2,groups= {"sanity"})
	void loginbyfb() {
		System.out.println("Login by Facebook");
	}
	@Test(priority=3,groups= {"sanity"})
	void loginbytwitter() {
		System.out.println("Login by Twitter");
	}
}
