package day25;

import org.testng.annotations.Test;

public class signUpTest {
	@Test(priority=1,groups= {"regression"})
	void signupByEmail() {
		System.out.println("sign by email");
	}
	@Test(priority=2,groups= {"regression"})
	void signupByfb() {
		System.out.println("sign by Facebook");
	}
	@Test(priority=3,groups= {"regression"})
	void signupBytwitter() {
		System.out.println("sign by Twitter");
	}
}

