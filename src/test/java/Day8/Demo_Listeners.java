package Day8;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Demo_Listeners implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println("Test started...");
		
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is successfully passed...");
		
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed...");
			try{
				TestUtil.screenshot();
			} catch(IOException e) {
				e.printStackTrace();
			}
	
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped...");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


}
