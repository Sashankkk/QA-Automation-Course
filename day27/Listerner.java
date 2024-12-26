package day27;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listerner implements ITestListener  {

	 public void onStart(ITestResult result) {
		    // not implemented
		 System.out.println("Start");
		  }
	
	  public void onTestStart(ITestResult result) {
		    // not implemented
		  System.out.println(" test Start");
		  }
	  public  void onTestSuccess(ITestResult result) {
		    // not implemented
		  System.out.println("Success");
		  }
	  public void onTestFailure(ITestResult result) {
		    // not implement
		  System.out.println("Fails");
		  }
	  
	  public void onTestSkipped(ITestResult result) {
		    // not implemented
		  System.out.println("Skipped");
		  }

	  public void onFinish(ITestResult result) {
		    // not implemented
		  System.out.println("Finish");
		  }
	  
	 	
}
