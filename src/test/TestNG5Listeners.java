package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG5Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("Test is Passed!!");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		//TestCase- Suppose my test case is fail and i have to screenshot the failure 
		//screenshot code 
		//TestCase - Suppose my RestAPI response code is 400 or above
		//restAPI code 
		
		System.out.println("testng.xml fails because of no test level parameterization is declared. "
		+ "Test Method is: " +result.getName());
		 
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

}
