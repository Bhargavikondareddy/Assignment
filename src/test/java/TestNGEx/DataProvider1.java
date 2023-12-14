package TestNGEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	WebDriver driver;
	@BeforeTest
	public void launchapplication() {
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "dp")
	  public void searchDetails(String keyword) throws InterruptedException {
		  System.out.println("searching:" + keyword );
			
			//search text
			driver.findElement(By.name("q")).sendKeys(keyword);	
			Thread.sleep(2000);
		
			//click on search button
			driver.findElement(By.name("btnK")).click();
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
	}
	
	@DataProvider(name = "dp")
    public Object[][] testData() {
        return new Object[][] {
            { "Selenium" },
            { "Java" },
            { "Python" }
        };
    }
	  
    @AfterTest
    public void closeBrowser() {
	    driver.quit();
    }
}
