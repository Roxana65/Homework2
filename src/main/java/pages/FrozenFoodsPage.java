package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrozenFoodsPage {

	WebDriver driver;

	public FrozenFoodsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='product-wrapper product-type-1'])[1]")
	public WebElement beef;
	@FindBy(xpath = "(//div[@class='product-wrapper product-type-1'])[2]")
	public WebElement fish;
	@FindBy(xpath = "//a[@href='?add-to-cart=368']")
	public WebElement addBeef;
	@FindBy(xpath = "//a[@href='?add-to-cart=362']")
	public WebElement addFish;

	public void moveTo(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}
}
