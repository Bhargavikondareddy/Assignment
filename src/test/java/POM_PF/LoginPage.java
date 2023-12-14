package POM_PF;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	//txtusername
	@FindBy(name = "username")
	WebElement un;
	
	//txtpassword
	@FindBy(how=How.NAME,using = "password")
	WebElement pwd;
	
	//btnlogin
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	WebElement btnlogin;
	
	public void login(String username, String password) {
		un.sendKeys(username);
		pwd.sendKeys(password);
		btnlogin.click();
		
	}
	

}
