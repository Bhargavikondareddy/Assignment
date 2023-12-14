package Day6;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TS_Features {
	WebDriver driver;
  @Test
  public void screenshotofwebelement() throws IOException, InterruptedException {
	  driver = new EdgeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement googleLogo = driver.findElement(By.className("lnXdpd"));
	  File src = googleLogo.getScreenshotAs(OutputType.FILE);
	   
	  Files.copy(src, new File("C:\\Users\\BhargaviK\\eclipse-workspace2\\Prj_SeleniumMVN\\src\\test\\java\\Screenshot\\googlelogo.jpg"));
	  Thread.sleep(2000);
	   
	  driver.close();
  }
  
  @Test
  public void hangleTabsnWins() throws InterruptedException {
	  driver = new EdgeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  
	  //Tab
	  driver.switchTo().newWindow(WindowType.TAB);
	  driver.get("https://www.w3schools.com");
	  
	  //Window
	  driver.switchTo().newWindow(WindowType.WINDOW);
	  driver.get("https://www.selenium.dev/downloads/");
	  
	  System.out.println(driver.getWindowHandles().size());
	  
	  Thread.sleep(2000);
	  
	  Set<String> winids = driver.getWindowHandles();
	  Iterator<String> itr = winids.iterator();
	  
	  List<String> windindex = new ArrayList<String>();
	  while(itr.hasNext()) {
		  windindex.add(itr.next());
	  }
	  driver.switchTo().window(windindex.get(0));
	  System.out.println("First win title is "+driver.getTitle());
	  driver.close();
	  
	  driver.switchTo().window(windindex.get(1));
	  System.out.println("Second win title is "+driver.getTitle());
	  driver.close();
	  
	  driver.switchTo().window(windindex.get(2));
	  System.out.println("Third win title is "+driver.getTitle());
	  driver.close();
	  
	  Thread.sleep(2000);
	  }
	  	  
  }
  
