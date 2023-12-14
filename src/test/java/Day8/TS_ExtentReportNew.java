package Day8;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

@Listeners(Demo_Listeners.class)
public class TS_ExtentReportNew {
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest test;	
		
	@BeforeTest
	public void setReport() {
		
		htmlreporter = new ExtentHtmlReporter(
				"C:\\Users\\BhargaviK\\eclipse-workspace2\\Prj_SeleniumMVN\\src\\test\\java\\Reports\\report1.html");
		htmlreporter.config().setEncoding("utf-8");
		htmlreporter.config().setDocumentTitle("Automation Report");
		htmlreporter.config().setReportName("Login Test Report");
		htmlreporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		extent.setSystemInfo("Tester", "Bhargavi K");
		extent.setSystemInfo("OS", "windows");
		extent.setSystemInfo("Environment", "QA");
	}
	
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	
	@Test(priority = 1)
	public void tc_login() {
		test = extent.createTest("Login Test");
		//System.out.println("Executing login test.....");
		
	}
	
	@Test(priority = 2)
	public void tc_searchitem() {
		test = extent.createTest("Search Item");
		Assert.fail("Search Item - Test Failed");
		
	}
	
	@Test(priority = 3)
	public void tc_logout() {
		test = extent.createTest("Logout Test");
		throw new SkipException("Skipping the test case - Logout");
	}
	
	@AfterMethod
	public void teardown(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			String failflag = "Test case failed";
			Markup m = MarkupHelper.createLabel(failflag, ExtentColor.RED);
			test.log(Status.FAIL, m);
			//test.fail(m);
		} else if(result.getStatus() == ITestResult.SKIP) {
			String skipflag = "Test case skipped";
			Markup m = MarkupHelper.createLabel(skipflag, ExtentColor.YELLOW);
			test.log(Status.SKIP, m);
			//test.skip(m);
		} else if(result.getStatus() == ITestResult.SUCCESS) {
			String methodname = result.getMethod().getMethodName();
			String logtxt = "<b><i>" + "TEST CASE: " + methodname.toUpperCase()+ " PASSED" + "</i></b>";
			Markup m = MarkupHelper.createLabel(logtxt, ExtentColor.GREEN);
			//test.log(Status.PASS, m);
			test.pass(m);
		}
	}
}
