package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	static //web elements
	WebElement ele;
	//username
	public static WebElement txtusername(WebDriver driver) {
		ele = driver.findElement(By.name("username"));
		return ele;
	}
	
	//password
	public static WebElement txtpassword(WebDriver driver) {
		ele = driver.findElement(By.name("password"));
		return ele;
	}
	
	
	//Login
	public static WebElement btnlogin(WebDriver driver) {
		ele = driver.findElement(By.xpath("//button[@type='submit']"));
		return ele;
	}


}
