package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MainScript {
	public static void main(String[] args) throws InterruptedException {
		//launch Browser
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Login
		//LoginPage loginpage = new LoginPage();
		LoginPage.txtusername(driver).sendKeys("Admin");
		LoginPage.txtpassword(driver).sendKeys("admin123");
		
		LoginPage.btnlogin(driver).click();
		
		Thread.sleep(2000);
		
		LogoutPage.txtdropdown(driver).click();
		Thread.sleep(2000);
		LogoutPage.txtlogout(driver).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
