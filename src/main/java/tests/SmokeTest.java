package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class SmokeTest extends BaseTest {

	@Test
	public void smokeForBlog() throws InterruptedException {

		page.home.clickOn(page.blog.blogSection);
		// verify the 4 articles
		page.blog.blogPosts();
		// comment for 1st art.
		page.home.clickOn(page.blog.firstTitle);
		page.blog.randomString();
		page.blog.postComment("Hope", "hope@gmail.com");
		Thread.sleep(3000);
		assertTrue(page.blog.theComment.isDisplayed());
		// comment for 2nd art.
		page.home.clickOn(page.blog.secondTitle);
		page.blog.randomString();
		page.blog.postComment("Hope", "hope@gmail.com");
		Thread.sleep(3000);
		assertTrue(page.blog.theComment.isDisplayed());
		// comment for 3rd art.
		page.home.clickOn(page.blog.thirdTitle);
		page.blog.randomString();
		page.blog.postComment("Hope", "hope@gmail.com");
		Thread.sleep(3000);
		assertTrue(page.blog.theComment.isDisplayed());
		// comment for 4th art.
		page.home.clickOn(page.blog.fourthTitle);
		page.blog.randomString();
		page.blog.postComment("Hope", "hope@gmail.com");
		Thread.sleep(3000);
		assertTrue(page.blog.theComment.isDisplayed());

	}
}
