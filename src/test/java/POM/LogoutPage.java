package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
	
	static //web elements
	WebElement ele;
	//dropdown
	public static WebElement txtdropdown(WebDriver driver) {
		ele = driver.findElement(By.className("oxd-userdropdown-tab"));
		return ele;
	}
	
	//logout
	public static WebElement txtlogout(WebDriver driver) {
		ele = driver.findElement(By.linkText("Logout"));
		return ele;
	}

}
