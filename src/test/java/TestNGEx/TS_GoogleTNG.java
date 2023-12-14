package TestNGEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_GoogleTNG {
	WebDriver driver;
	
	@BeforeTest
	public void launchapplication() {
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");	
	}
  @Test
  public void verifytitle() throws InterruptedException {	
	  
		driver.manage().window().maximize();
		
		//search text
		driver.findElement(By.name("q")).sendKeys("Selenium tutorial");
		
		Thread.sleep(2000);
		
		//click on search button
		driver.findElement(By.name("btnK")).click();
		
		//pause
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		if(title.equals("Selenium tutorial - Google Search")) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int totalLinkSize = totalLinks.size();
		System.out.println("Total Links by Way1 : " + totalLinkSize);
		 
		 
		int totalLinkSize2 = driver.findElements(By.xpath("//a")).size();
		System.out.println("Total Links by Way2 : " + totalLinkSize2);
		
		
		driver.close();
  }
  
  @AfterTest
  public void closeBrowser() {
	  driver.close();
  }
  
}
