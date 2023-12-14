package TestNGEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TS_ParallelBrowser {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String browser1) throws InterruptedException {
		if(browser1.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browser1.equals("edge")) {
			driver = new EdgeDriver();
		}else if(browser1.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	}
		
  @Test
  public void verifyTitle() {
	  String title = driver.getTitle();
	  if(title.equalsIgnoreCase("google")) {
		  System.out.println("Passed");
	  }else {
		  System.out.println("Failed");
	  }
  }
}
