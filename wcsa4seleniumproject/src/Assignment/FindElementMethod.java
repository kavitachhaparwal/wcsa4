package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	private static final int i = 0;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//input[@class='gLFyf']"));
		for (int i=0; i<suggestions.size();i++);
		{
			WebElement options = suggestions.get(i);
			String opt = options.getText();
			
           System.out.println(opt);
		}
		
		

	}

}
