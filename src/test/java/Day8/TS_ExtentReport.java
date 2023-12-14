//package Day8;
//
//import org.openqa.selenium.WebDriver;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//public class TS_ExtentReport {
//	public static void main(String[] args) {
//		ExtentReports extent;
//		ExtentTest test;
//		WebDriver driver;
//	    ExtentHtmlReporter htmlreporter;
//		
//		htmlreporter = new ExtentHtmlReporter("C:\\Users\\BhargaviK\\eclipse-workspace2\\Prj_SeleniumMVN\\src\\test\\java\\Reports\\report1.html");
//		
//	
//		htmlreporter.config().setEncoding("utf-8");
//		htmlreporter.config().setDocumentTitle("Automation Report");
//		htmlreporter.config().setReportName("Login Test Report");
//		htmlreporter.config().setTheme(Theme.DARK);
//		
//		extent = new ExtentReports();
//		extent.attachReporter(htmlreporter);
//		
//		extent.setSystemInfo("Tester", "Bhargavi K");
//		extent.setSystemInfo("OS", "windows");
//		extent.setSystemInfo("Environment", "QA");
//		
//		test = extent.createTest("Login Test");
//		//System.out.println("Executing login test.....");
//		
//		test = extent.createTest("Search Item");
//		//Assert.fail("Search Item - Test Failed");
//		
//		test = extent.createTest("Logout Test");
//		throw new SkipException("Skipping the test case - Logout");
//		
//		
//		
//	}
//	
//
//}
