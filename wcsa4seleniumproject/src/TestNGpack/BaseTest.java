package TestNGpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	
    static WebDriver driver;
    
  @Test
  @Parameters({"browser","url"})
  
  public void setUp(String browservalue,String url) {
	  
	  if(browservalue.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(url);
	  }
	  else if (browservalue.equals("firefox"))
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get(url);
	  }
	  else 
	  {
		  Reporter.log("enter the valid browservaluse!!" , true);
		  
	  }
  }
  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
	  
	  
  
	  
}
