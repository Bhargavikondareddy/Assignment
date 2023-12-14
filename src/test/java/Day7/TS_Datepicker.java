package Day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TS_Datepicker {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://jqueryui.com/datepicker/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//Approach1
		//driver.findElement(By.id("datepicker")).sendKeys("12/12/2023");
		
		//Approach2
		String year = "2024";
		String month = "October";
		String date = "12";
		
		driver.findElement(By.id("datepicker")).click();
		
		//select month and year
		while(true) {
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month)&& yr.equals(year)) {
				break;
			}
			
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		Thread.sleep(2000);
		
		//select date
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement dt:alldates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
		Thread.sleep(2000);
		
		driver.close();
  }
}
