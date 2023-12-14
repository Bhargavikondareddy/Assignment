package TestNGEx;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TS_DataProvider {

  @Test(dataProvider = "dp1")
  public void empdetails(Integer empid, String name, String city) {
	  System.out.println("Emp id " + empid + "Name " + name + "City " + city);
  }
  
  @DataProvider
  public Object[][] dp1() {
	  return new Object[][] {
		  new Object[] { 001, "Nilesh", "Mumbai" },
		  new Object[] { 002, "Sachin", "Pune" },
	  };
  }
  
}
