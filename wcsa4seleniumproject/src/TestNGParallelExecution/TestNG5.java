package TestNGParallelExecution;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG5 {
  @Test
  public void M1() {
	  Assert.fail();
	  Reporter.log("Method m1", true);
  }
  
  @Test(dependsOnMethods = "m1", alwaysRun= true)
  public void M2()
  {
	 Reporter.log("Method m2", true);
  }
}
