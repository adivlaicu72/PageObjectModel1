package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObject.MenuPage;
import utils.BaseTest;

public class C25_Js2_Homework extends BaseTest{
	
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

		WebElement galleryFormat = driver.findElement(By.xpath("//a[contains(text(), 'Gallery Format')]"));
		
		//scroll to element with JS
		jse.executeScript("arguments[0].scrollIntoView(true)", galleryFormat);
		Thread.sleep(1000);
	
	}
}
