package TakeScreenShotDynamic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class BaseTest {
	static WebDriver driver;
	
  @Test
  public void initialization() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("http://desktop-hobi2ku/login.do");
  }
  @Test
  public void failed(String methodName) throws IOException
  {
	  try
	  {
	  TakesScreenshot ts =( TakesScreenshot)driver;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenShots/"+methodName+".png");
	Files.copy(src, dest);
	  
  }
   catch  (Exception e)
  {
	  
  }
}
}
