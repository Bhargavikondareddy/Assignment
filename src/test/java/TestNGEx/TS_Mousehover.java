package TestNGEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TS_Mousehover {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_event_mouseover_mouseout");
	  driver.manage().window().maximize();
	  
	  driver.switchTo().frame("iframeResult");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement txt = driver.findElement(By.xpath("/html/body/p"));
	  
	  Actions action = new Actions(driver);
	  action.moveToElement(txt).build().perform();
	  
	  Thread.sleep(2000);
	  
	  driver.close();
  }
}
