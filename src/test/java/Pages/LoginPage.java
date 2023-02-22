package Pages;

import com.test.testng.orangeHrm.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

	// Page Factory - OR:

	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement username;

	@FindBy(xpath = "//input[@name='txtPassword']")
	WebElement password;

	@FindBy(xpath = "//input[@name='Submit']")
	WebElement submitBtn;

	// Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	// Actions:

	public HomePage login(String un, String pwd) {

		username.sendKeys(un);
		password.sendKeys(pwd);
		submitBtn.click();
		return new HomePage();

	}
}
