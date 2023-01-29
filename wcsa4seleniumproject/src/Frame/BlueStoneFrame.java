package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrame {

	private static String frameElement;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(2000);
         driver.findElement(By.xpath("//span[.='Not now']"));
         Thread.sleep(2000);
         
         //switch the controls to frame
         WebElement frameElement = driver.findElement(By.id("fc_widget"));
         driver.switchTo().frame(frameElement);
         Thread.sleep(2000);
         driver.findElement(By.id("chat-icon")).click(); //clicking on chat box
         driver.switchTo().parentFrame();
         driver.findElement(By.id("chat-fc-name")).sendKeys("admin");
	}

}
