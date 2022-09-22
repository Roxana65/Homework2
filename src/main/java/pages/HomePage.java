package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(text(),'My account')]")
	public WebElement myAccountButton;
	@FindBy(xpath = "//input[@type='search']")
	public WebElement searchButton;
	@FindBy(xpath = "//a[@href='https://keyfood.ro/product/rold-gold-tiny-twists-pretzels/']")
	public WebElement searchResult;
	@FindBy(xpath = "//a[@data-toggle='collapse']")
	public WebElement allCategories;

	// locators test case no. 2

	@FindBy(xpath = "(//a[@href='https://keyfood.ro/product-category/frozen-foods/'])[2]")
	public WebElement frozenSection;

	public void clickOn(WebElement element) throws InterruptedException {
		element.click();
		Thread.sleep(3000);
	}

	public void searchProduct(String productName) throws InterruptedException {
		searchButton.sendKeys(productName);
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.click(searchResult).perform();
		Thread.sleep(3000);
	}
}
