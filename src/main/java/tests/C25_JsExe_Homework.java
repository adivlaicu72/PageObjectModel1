package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObject.MenuPage;
import utils.BaseTest;

public class C25_JsExe_Homework extends BaseTest{
	
	@Test
	public void postGalleryFormat() throws InterruptedException {
		
		MenuPage menu =  new MenuPage(driver);
		menu.hoverElement(menu.blogLink);
		Thread.sleep(3000);
		menu.hoverElement(menu.blogSubMenuPostFormats);
		Thread.sleep(3000);
		menu.navigateTo(menu.blogSubMenuPostFormats);
		menu.navigateTo(menu.galleryFormat);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	
	}
}
