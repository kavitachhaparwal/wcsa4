package PagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage {
    
	@FindBy (xpath = "//div[@class='label' and (.='users')]")private WebElement users;
	@FindBy (xpath = "//input[@type='button' and (@value='Create New User')]") private WebElement createusers;
	@FindBy (name = "username") private WebElement usnTextBox;
	@FindBy (name = "passwordText")private WebElement retypePassTextBox;
	@FindBy (name = "firstName") private WebElement firstNameTextBox;
	@FindBy (name = "lasttName") private WebElement lastNameTextBox;
	@FindBy (xpath = "//input[@type= 'button' and (@value '    cancel    ')]") private WebElement createuserButton;
	@FindBy (xpath = "//input ) private WebElement

}
