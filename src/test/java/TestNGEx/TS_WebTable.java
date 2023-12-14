package TestNGEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TS_WebTable {
  @Test
  public void webtable() throws InterruptedException {
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.w3schools.com/html/html_tables.asp");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  int rowCount = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")).size();
	  System.out.println("row count: " + rowCount);
	  
	  int colCount = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td")).size();
	  System.out.println("col count: " + colCount);
	  
	  for (int i=2; i<=rowCount;i++) {
		  for (int j=2;j<=colCount;j++) {
			  
			  //String data = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[i]/td[j]"));
			  String s1 ="//*[@id='customers']/tbody/tr[";
			  String s2 ="]/td[";
			  String s3 ="]";
			  
			  String finalstring = s1+i+s2+j+s3;
			  String data = driver.findElement(By.xpath(finalstring)).getText();
			  System.out.println(data + "\n");
		  }
	  }
	  
	  Thread.sleep(2000);
	  
	  driver.close();
  }
}
