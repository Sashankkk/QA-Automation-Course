package day24a;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test
	void pqr() {
		System.out.println("PQR from C3");
	}
	
	@AfterSuite
	void as() {
		System.out.println("After suite C3");
	}
	@BeforeSuite
	void bs() {
		System.out.println("Before suite c3");
	}
}
