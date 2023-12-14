package POM_PF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MainScript {
  @Test
  public void verifylogin() throws InterruptedException {
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	  //Login
	  LoginPage loginpage = PageFactory.initElements(driver,LoginPage.class);
	  loginpage.login("Admin", "admin123");
	  
	  Thread.sleep(2000);
	  
	  //Logout
	  LogoutPage logoutpage = PageFactory.initElements(driver,LogoutPage.class);
	  logoutpage.logout();
	  Thread.sleep(2000);

	  driver.close();
  }
}
