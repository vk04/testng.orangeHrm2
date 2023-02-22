package Pages;

import static org.testng.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.testng.orangeHrm.Base;

public class HomePage extends Base {

	// Page Factory - OR:

	@FindBy(xpath = "//input[@value='Subscribe']")
	WebElement verifySubscribe;

	@FindBy(xpath = "//span[contains(text(),'Assign Leave')]")
	WebElement assignLeave;

	@FindBy(xpath = "//b[normalize-space()='Maintenance']")
	WebElement mantainanceTab;

	@FindBy(xpath = "//input[@value='Verify']")
	WebElement verifyBtn;

	@FindBy(xpath = "//b[normalize-space()='My Info']")
	WebElement myInfotab;

	@FindBy(xpath = "//a[normalize-space()='Contact Details']")
	WebElement contactDetails;

	@FindBy(xpath = "//input[@id='btnSave']")
	WebElement editbtn;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	// Actions:

	public void verifySubscribebtn() {
		try {

			assertEquals(verifySubscribe.isDisplayed(), true);
		} catch (NoSuchElementException e) {
			System.err.println(e);
		}
	}

	public void verifyAssignLeave() {
		String str = assignLeave.getText();
		assertEquals(str, "Assign Leave");
	}

	public void verifyBtn() {

		mantainanceTab.click();

		boolean ver = verifyBtn.isDisplayed();

		assertEquals(ver, true);
	}

	public void verifyMyinfoEdit() {
		myInfotab.click();

		wait.until(ExpectedConditions.elementToBeClickable(contactDetails));

		boolean ver2 = editbtn.isDisplayed();
		assertEquals(ver2, true);
	}

}
