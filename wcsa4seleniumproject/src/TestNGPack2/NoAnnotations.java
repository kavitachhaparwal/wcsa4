package TestNGPack2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NoAnnotations {
  @Test
  public void test() {
	   Reporter.log("@Test Annotations" , true);
  }
  @BeforeSuite
  
  public void beforeSuite()
  {
	  Reporter.log("@beforeSuite Annotations", true);
  }
    @AfterSuite()
    public void  afterSuite()
    {
    	 Reporter.log("@afterSuite Annotations", true);
    }
    @AfterTest
    
    public void afterTest()
    {
    	  Reporter.log("@afterTest Annotations", true);
    }
   @BeforeTest
    
    public void beforeTest()
    {
    	  Reporter.log("@beforeTest Annotations", true);
    }
 @BeforeMethod
    
    public void beforeMethod()
    {
    	  Reporter.log("@beforeMethod Annotations", true);
    }
 @AfterMethod
 
 public void afterMethod()
 {
 	  Reporter.log("@afterMethod Annotations", true);
 }
 @BeforeClass
 
 public void beforeClass()
 {
 	  Reporter.log("@beforeClass Annotations", true);
 }
 @AfterClass
 
 public void afterClass()
 {
 	  Reporter.log("@afterClass Annotations", true);
 }
}
