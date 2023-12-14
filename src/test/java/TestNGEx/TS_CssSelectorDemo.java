package TestNGEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TS_CssSelectorDemo {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://demo.nopcommerce.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //css selector tag and id
	  //driver.findElement(By.cssSelector("#small-searcherms")).sendKeys("MacBook");
	  //driver.findElement(By.cssSelector("input#small-searcherms")).sendKeys("MacBook");
	  
	//css selector class
	  //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");
	  driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
	  
	  Thread.sleep(2000);
	  driver.close();
	  
  }
}
