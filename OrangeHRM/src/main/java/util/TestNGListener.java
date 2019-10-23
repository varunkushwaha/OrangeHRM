package util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testbase.TestBase;

public class TestNGListener extends TestBase implements ITestListener{

	@Override
	public void onFinish(ITestContext Result) {
     System.out.println("Execution of all the test cases has been completed");
	}

	@Override
	public void onStart(ITestContext Result) {
		System.out.println("Test cases execution has been Started");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		
		}

	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println("Failed test cases is == "+Result.getName());
		Util.CaptureScreencast(driver, Result.getName());
		System.out.println("Screencast captured");
		}

	@Override
	public void onTestSkipped(ITestResult Result) {
		
		System.out.println("Skipped test cases is == "+Result.getName());
	}

	@Override
	public void onTestStart(ITestResult Result) {
     System.out.println("Test case " +Result.getName()+ " started");
	}

	
	  @Override public void onTestSuccess(ITestResult Result) {
	  System.out.println("Passed test case is == "+Result.getName());
	  
	  }
	 

}
