package POM_PF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutPage {
	//txtdropdown
	@FindBy(className = "oxd-userdropdown-tab")
	WebElement dropdn;
	
	//txtlogout
	@FindBy(how=How.LINK_TEXT,using = "Logout")
	WebElement lout;
	
	
	public void logout() throws InterruptedException {
		dropdn.click();
		Thread.sleep(2000);
		lout.click();
		  
		  
}
}
