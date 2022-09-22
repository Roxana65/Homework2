package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeveragesPage {

	WebDriver driver;

	public BeveragesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@href='https://keyfood.ro/product-category/beverages/'])[2]")
	public WebElement beveragesSection;
	@FindBy(xpath = "(//div[@class='product-wrapper product-type-1'])[2]")
	public WebElement cocaCola;
	@FindBy(xpath = "//a[@href='?add-to-cart=387']")
	public WebElement addCola;

}
