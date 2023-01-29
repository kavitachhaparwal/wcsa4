package Qsp;

public class launchFireFox{

	public static void main(String[] args) {
		System.setproperty("webdriver.;gecko.driver","./drivers/geckodriver.exe");
		new FireFoxdriver();
	}
}
