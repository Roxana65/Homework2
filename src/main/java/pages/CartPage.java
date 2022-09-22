package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='button-icon'])[2]")
	public WebElement cartIcon;
	@FindBy(xpath = "//div[@class='quantity-button plus']")
	public WebElement plusButton;
	@FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[5]")
	public WebElement subtotal;
	@FindBy(xpath = "//td[@data-title='Total']")
	public WebElement total;
	@FindBy(xpath = "(//a[@href='https://keyfood.ro/checkout-2/'])[4]")
	public WebElement checkoutButton;
	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement conditionsButton;
	@FindBy(xpath = "//button[@name='woocommerce_checkout_place_order']")
	public WebElement placeOrderButton;
	@FindBy(xpath = "//*[contains(text(),\"Thank you. Your order has been received.\")]")
	public WebElement confirmationMessage;
	@FindBy(xpath = "//li[@class='woocommerce-order-overview__order order']")
	public WebElement orderNumber;
	@FindBy(xpath = "//input[@name='coupon_code']")
	public WebElement cuponCodeSection;
	@FindBy(xpath = "//button[@name='apply_coupon']")
	public WebElement applyCupon;
	@FindBy(xpath = "//tr[@class='cart-discount coupon-keyfood31122021']")
	public WebElement cuponValue;

	public void addCuponMethod(String cupon) {
		cuponCodeSection.sendKeys(cupon);
		applyCupon.click();
	}
}
