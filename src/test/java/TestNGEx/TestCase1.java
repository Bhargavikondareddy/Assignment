package TestNGEx;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase1 {
  @Test(enabled=false)
  public void test1() {
	  System.out.println("test1");
  }
  @Test
  public void test2() {
	  System.out.println("test2");
	  throw new SkipException("Skipping this test2");
	  
  }
}
