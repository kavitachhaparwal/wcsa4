package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.drivers", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///c:/users/Qspiders%20Wakad/Desktop/wcsa4/checkbox.html");
		String Sourcecode = driver.getPageSource();
		Thread.sleep(2000);
		System.out.println(Sourcecode);

	}

}