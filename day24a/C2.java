package day24a;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
	@Test
	void def() {
		System.out.println("ABC from C2");
	}
	@AfterTest
	void at() {
		System.out.println("After Test");
	}
}


