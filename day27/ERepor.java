package day27;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ERepor implements ITestListener{
	public ExtentSparkReporter sparkReporter; //UI  
	public ExtentReports extentReports; //Common information
	public ExtentTest test; //update reports status

  
	    public void onStart(ITestContext context) {
	    	sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReports.html");
	    	sparkReporter.config().setDocumentTitle("Automation Testing");
	    	sparkReporter.config().setReportName("Funcional Testing");
	    	sparkReporter.config().setTheme(Theme.DARK);
	    	extentReports = new ExtentReports();
	    	extentReports.attachReporter(sparkReporter);
	    	
	    	extentReports.setSystemInfo("Computer Name","localhost");
	    	extentReports.setSystemInfo("Environment","QA");
	    	extentReports.setSystemInfo("Tester Name","Sashank");
	    	extentReports.setSystemInfo("OS","Windows10");
	    	extentReports.setSystemInfo("Browser Name","Chrome");
	    	
	      
	    }
	    
	  

		public void onTestSuccess(ITestResult result) {
			test = extentReports.createTest(result.getName());
			test.log(Status.PASS, "Test Case passed is:" + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	    	test = extentReports.createTest(result.getName());
			test.log(Status.FAIL, "Test Case failed is:" + result.getName());
			test.log(Status.FAIL, "Test Case failed is:" + result.getThrowable());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	    	test = extentReports.createTest(result.getName());
			test.log(Status.SKIP, "Test Case Skipped is:" + result.getName());
	    }



		@Override
	    public void onFinish(ITestContext context) {
	        // Flush the report
	    	extentReports.flush();
	    }

	
	
}
