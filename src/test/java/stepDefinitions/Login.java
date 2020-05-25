package stepDefinitions;

import org.testng.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Login_PO;
import utilities.Base;

//@RunWith(Cucumber.class)
public class Login extends Base {

	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
		System.out.println("Inside given");
		launchBrowser();
		driver.get(appURL);
	}

	@When("^I enter \"([^\"]*)\", \"([^\"]*)\" and click on Submit button$")
	public void enter_username_password_submit(String username, String password) throws Throwable {
		System.out.println("Inside when");
		Login_PO login = new Login_PO(driver);
		login.getLogin().sendKeys(username);
		login.getPassword().sendKeys(password);
		login.getSubmitBtn().click();

	}

	@Then("^I land on home page$")
	public void i_land_on_home_page() throws Throwable {
		System.out.println("Inside then");
		String title = driver.getTitle();
		Assert.assertEquals(
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!",
				title);
		
	}

}
