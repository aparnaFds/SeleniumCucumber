package stepDefinitions;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.And;
import pageObjects.Login_PO;
import utilities.Base;

//@RunWith(Cucumber.class)
public class Logout extends Base {

	@And("^I click logout button$")
	public void i_click_logout_button() throws Throwable {
		System.out.println("Inside logout when");
		Login_PO login = new Login_PO(driver);
		Actions action = new Actions(driver);
		action.moveToElement(login.getcaret()).clickAndHold().build().perform();

	}

	@And("^I close browser$")
	public void i_close_browser() throws Throwable {
		System.out.println("Inside logout then close");
		closeBrowser();
	}

}
