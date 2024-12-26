package day24a;

import org.testng.annotations.*;


public class AllAnno {
	@BeforeSuite
	void bs() {
		System.out.println("Before suite c3");
	}
	@AfterSuite
	void as() {
		System.out.println("After suite C3");
	}


	@BeforeTest
		void bt() {
	System.out.println("Before Test");
}
	@AfterTest
	void at() {
		System.out.println("After Test");
	}
	@BeforeClass
	void login() {
		System.out.println("Login");
	}
	@AfterClass
	void logout() {
		System.out.println("Logout");
	}
	@BeforeMethod
	void login1() {
		System.out.println("Login");
	}
	
	@AfterMethod
	void logout1() {
		System.out.println("Logout");
	}

	@Test
	void abc() {
		System.out.println("ABC from C1");
	
	}
}

