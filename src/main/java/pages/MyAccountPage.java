package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Log;

public class MyAccountPage {

	public WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	public WebElement userNameField;
	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordField;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginButton;

	public void loginMethod(String username, String password) {
		Log.info("called method loginMethod");
		Log.info("Send keys with value" + username);
		userNameField.sendKeys(username);
		passwordField.sendKeys(password);
		Log.info("Send keys with value" + password);

		loginButton.click();
		Log.info("Clicked on submit button");
	}
}
