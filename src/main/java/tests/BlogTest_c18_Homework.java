package tests;

import org.testng.annotations.Test;

import utils.BaseTest;
import pageObject.MenuPage;
import pageObject.BlogPage;

public class BlogTest_c18_Homework extends BaseTest{
	
	@Test(priority=1)
	public void addCommentBlogTest() {
		
		MenuPage menu =  new MenuPage(driver);
		menu.hoverElement(menu.blogLink);
		BlogPage blog = new BlogPage(driver);
		blog.selectByVisibleText();
		blog.clickReadMoreButton();
		blog.addComment();
		blog.clickPostCommentButton();
		blog.checkcommentIsAwaitingModerationPresent();	
	
	}	

}
