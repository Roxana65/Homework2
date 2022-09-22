package pages;

import static org.testng.Assert.assertEquals;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogPage {

	WebDriver driver;

	public BlogPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@href='https://keyfood.ro/blog/'])[2]")
	public WebElement blogSection;
	//
	@FindBy(xpath = "(//h2[@class='entry-title'])[1]")
	public WebElement firstTitle;
	@FindBy(xpath = "(//h2[@class='entry-title'])[2]")
	public WebElement secondTitle;
	@FindBy(xpath = "(//h2[@class='entry-title'])[3]")
	public WebElement thirdTitle;
	@FindBy(xpath = "(//h2[@class='entry-title'])[4]")
	public WebElement fourthTitle;
	//
	@FindBy(xpath = "//textarea[@id='comment']")
	public WebElement commSection;
	@FindBy(xpath = "//input[@id='author']")
	public WebElement authorSection;
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailSection;
	@FindBy(xpath = "//input[@id='submit']")
	public WebElement postButton;
	@FindBy(xpath = "//*[contains(text(),'Hope')]")
	public WebElement theComment;

	public void blogPosts() throws InterruptedException {
		List<WebElement> blogList = driver.findElements(By.xpath("//a[@class='button']"));
		Actions actions = new Actions(driver);

		String[] expectedPosts = { "Read More", "Read More", "Read More", "Read More" };

		for (int i = 0; i <= blogList.size() - 1; i++) {
			actions.moveToElement(blogList.get(i)).perform();
			assertEquals(expectedPosts[i], blogList.get(i).getText());
		}
	}

	public void randomString() {
		byte[] array = new byte[7]; // length is bounded by 7
		new Random().nextBytes(array);
		String generatedString = new String(array, Charset.forName("UTF-8"));
		commSection.sendKeys(generatedString);
	}

	public void postComment(String name, String email) {
		authorSection.sendKeys(name);
		emailSection.sendKeys(email);
		postButton.click();
	}
}
