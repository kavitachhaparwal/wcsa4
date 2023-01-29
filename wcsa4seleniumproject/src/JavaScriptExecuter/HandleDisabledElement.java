package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Admit/OneDrive/Desktop/wcsa4/username.html");
		
		//typeCasting of JavaScriptExecutor for handle Disable webElement
		
      
		JavascriptExecutor js = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			  js.executeScript("document.getElementById('i2').value='manager'");
        
	}
}
