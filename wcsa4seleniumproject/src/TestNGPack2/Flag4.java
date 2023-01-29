package TestNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {


@Test
  public void LogInMethod() {
	  
	  Reporter.log("Log IN is Done!1",true);
	  
  }
    @Test (dependsOnMethods = "LogInMethod")
    public void CreateUser()
    {
    	Reporter.log("User Create!!",true);
    	
    }
    @Test (dependsOnMethods = "CreateUser")
    public void LogOutMethod()
    {
    	Reporter.log("Log Out Done!!", true);
    }
    
    
    
    
}
