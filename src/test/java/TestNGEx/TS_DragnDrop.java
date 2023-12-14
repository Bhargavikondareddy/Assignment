package TestNGEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TS_DragnDrop {
  @Test
  public void dragndrop() throws InterruptedException {
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://jqueryui.com/droppable/");

		// Max browser
		driver.manage().window().maximize();

		//missing something here
		driver.switchTo().frame(0);
		
		// implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		
		Actions action = new Actions(driver);
		
		//action - dragndrop()
		action.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(2000);
		
		driver.close();
  }
}
