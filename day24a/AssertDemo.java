package day24a;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	
	@Test
	void testTitle() {
		String exp_title = "JKP";
		String act_Title = "JPK";

		Assert.assertEquals(exp_title, act_Title);
	}
	
}
