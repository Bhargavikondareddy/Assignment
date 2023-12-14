package TestNGEx;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TS_Select {
  @Test
  public void selectitem() throws InterruptedException, IOException {
	  WebDriver driver = new EdgeDriver();
	  driver.get("file:///C:/Users/BhargaviK/OneDrive%20-%20CitiusTech/Documents/ListExample.html");
	  
	  WebElement carlist = driver.findElement(By.name("cars"));
	  Select car = new Select(carlist);
	  
	  car.selectByIndex(1);
	  Thread.sleep(2000);
	  
	  car.selectByValue("audi");
	  Thread.sleep(2000);
	  
	  car.selectByVisibleText("Opel");
	  Thread.sleep(2000);
	  //Take snapshot
	  File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File destfile = new File("C:\\Users\\BhargaviK\\eclipse-workspace2\\Prj_SeleniumMVN\\src\\test\\java\\Screenshot\\select.jpg");
	  //File f = new File("C:\\Users\\BhargaviK\\eclipse-workspace2\\Prj_SeleniumMVN\\src\\test\\java\\Screenshot");
	  Files.copy(srcfile, destfile);
	  Thread.sleep(2000);
	  
	  List<WebElement> list = car.getOptions();
	  System.out.println(list.size());
	  
	  driver.close();
	  
  }
  
}
