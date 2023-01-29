package methodsofwebelement;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("kavita123");
		driver.findElement(By.name("password")).sendKeys("idontknow");
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class)"));
		boolean status = loginButton.isEnabled();
		System.out.println(status);
		

	}

}
