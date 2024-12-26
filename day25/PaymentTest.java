package day25;

import org.testng.annotations.Test;

public class PaymentTest {
	@Test(priority=1,groups= {"sanity","regression","functional"})
	void payRs() {
		System.out.println("By Rupees");
	}
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void payVisa() {
		System.out.println("By Visa Card");
	}
}
