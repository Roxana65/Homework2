package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingDetailsPage {

	WebDriver driver;

	public BillingDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='billing_first_name']")
	public WebElement firstNameSection;
	@FindBy(xpath = "//input[@name='billing_last_name']")
	public WebElement lastNameSection;
	@FindBy(xpath = "//input[@name='billing_address_1']")
	public WebElement adressSection;
	@FindBy(xpath = "//input[@name='billing_city']")
	public WebElement citySection;
	@FindBy(xpath = "//input[@name='billing_postcode']")
	public WebElement postcodeSection;
	@FindBy(xpath = "//input[@name='billing_phone']")
	public WebElement phoneSection;
	@FindBy(xpath = "//input[@name='billing_email']")
	public WebElement emailSection;

	public void fillingIn(String firstName, String lastName, String adress, String city, String postcode, String phone,
			String email) {
		firstNameSection.sendKeys(firstName);
		lastNameSection.sendKeys(lastName);
		adressSection.sendKeys(adress);
		citySection.sendKeys(city);
		postcodeSection.sendKeys(postcode);
		phoneSection.sendKeys(phone);
		emailSection.sendKeys(email);

	}

}
