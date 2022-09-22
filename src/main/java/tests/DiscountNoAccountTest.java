package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class DiscountNoAccountTest extends BaseTest {

	@Test
	public void discountNoAcc() throws InterruptedException {

		page.home.clickOn(page.home.frozenSection);

		page.frozenFoods.moveTo(page.frozenFoods.beef);
		page.home.clickOn(page.frozenFoods.addBeef);
		Thread.sleep(2000);
		page.frozenFoods.moveTo(page.frozenFoods.fish);
		page.home.clickOn(page.frozenFoods.addFish);
		page.home.clickOn(page.home.allCategories);
		page.frozenFoods.moveTo(page.beverages.beveragesSection);
		page.home.clickOn(page.beverages.beveragesSection);
		page.frozenFoods.moveTo(page.beverages.cocaCola);
		page.home.clickOn(page.beverages.addCola);
		page.home.clickOn(page.cart.cartIcon);
		Thread.sleep(4000);
		assertEquals(page.cart.total.getText(), "$11.82");
		page.cart.addCuponMethod("keyfood31122021");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(page.cart.cuponValue));

		assertNotEquals(page.cart.total, "11.82");

		page.home.clickOn(page.cart.checkoutButton);
		page.billingDetails.fillingIn("Hope", "Lane", "no.32, Nicolas", "Chicago", "60007", "0747443921",
				"hope@gmail.com");
		page.home.clickOn(page.cart.conditionsButton);
		page.home.clickOn(page.cart.placeOrderButton);
		assertTrue(page.cart.confirmationMessage.isDisplayed());
		assertTrue(page.cart.orderNumber.isDisplayed());
	}

}
