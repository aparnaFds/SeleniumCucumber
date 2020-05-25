package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_PO {

	WebDriver driver;

	public Login_PO(WebDriver driver) {
		this.driver = driver;
	}

	By login = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	public WebElement getLogin() {
		return driver.findElement(login);
	}

	By password = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	public WebElement getPassword() {
		return driver.findElement(password);
	}

	By submitBtn = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");

	public WebElement getSubmitBtn() {
		return driver.findElement(submitBtn);
	}

	By caret = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div");
	public WebElement getcaret() {
		return driver.findElement(caret);
	}

	//By logoutBntn = By.linkText("Logout");
	By logoutBntn = By.xpath("//*[@text()='Logout']");
	
	public WebElement getlogoutBntn() {
		return driver.findElement(logoutBntn);
	}

}
