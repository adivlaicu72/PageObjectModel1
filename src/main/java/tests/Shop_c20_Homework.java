package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pageObject.MenuPage;
import pageObject.ShopPage;
import utils.BaseTest;

public class Shop_c20_Homework extends BaseTest{
	
	@Test
	public void bookShopTest() {
	MenuPage menu =  new MenuPage(driver);
	menu.navigateTo(menu.shopLink);
	ShopPage shop = new ShopPage(driver);
	shop.navigateTo(shop.bookCookingWithLove);
	
	assertTrue(shop.checkTitleleBookCookingWithLovePresent());
	
	//assertTrue(shop.checkProductGalleryTriggerPresent());
	
	assertTrue(shop.checkRatingPresent());
	assertTrue(shop.checkPricePresent());
	
	}
}
