package TestNGEx;

import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_TestngDemo {
	@BeforeMethod
	public void setup() {
		System.out.println("Before Method...");
	}
		

    @Test(priority=1)
    public void login() {
      System.out.println("login test case");
    }

    @Test(priority=2)
    public void search() {
  	  System.out.println("search");  }

    @Test(priority=3)
    public void validate() {
  	  System.out.println("validate");  }

    @Test(priority=4)
    public void print() {
  	  System.out.println("print");  }

    @Test(priority=5)
    public void logout() {
  	  System.out.println("logout");  }

    @Test(priority=6)
    public void testcase6() {
  	  System.out.println("testcase6");  }
 
	@AfterMethod
	public void teardown() {
		System.out.println("After Method...");
		
}
}
