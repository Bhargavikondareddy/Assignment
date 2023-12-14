package TestNGEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class TS_radiobuttons {
  @Test
  public void radiobutton() throws InterruptedException {
	  WebDriver driver = new EdgeDriver();
	  driver.get("file:///C:/Users/BhargaviK/OneDrive%20-%20CitiusTech/Documents/radiobuttons_html.html");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("css")).click();

	  //Assert.assertEquals("hello", "Hello1");
	  
	  Thread.sleep(2000);
	  driver.close();
  }
}
