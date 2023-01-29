package MethodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Managemethod {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver", "./drivers/chrome.exe");
		WebDriver driver = new ChromeDriver( );
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//set position = point
		
		Dimension targetsize = new Dimension(450,250);
		driver.manage().window().setSize(targetsize);
		
		Point targetposition1 = new Point (30,250);
		driver.manage().window().setPosition(targetposition1);
		

	}

}
