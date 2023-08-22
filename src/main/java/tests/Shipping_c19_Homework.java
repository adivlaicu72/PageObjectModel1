package tests;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.MenuPage;
import pageObject.ShippingPage;
import utils.BaseTest;

//using select class selenium

public class Shipping_c19_Homework extends BaseTest{
	
	//deschidem keybooks.ro si facem login
	
	@Test()
	public void loginAccess() throws InterruptedException {
		
		MenuPage menu =  new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		LoginPage login = new LoginPage(driver);
		login.loginInApp("TestUser", "12345@67890");
	
		//Navigare catre pagina https://keybooks.ro/account/edit-address/shipping/
		
		ShippingPage shipping = new ShippingPage(driver);
		shipping.navigateTo(shipping.userPlaceholder);
		shipping.hoverElement(shipping.userSettings);
		shipping.navigateTo(shipping.shippingbilling);
		shipping.navigateTo(shipping.shippingbillingAddButton);
		
	
		Select country = new Select(driver.findElement(By.id("shipping_country")));
		driver.findElement(By.xpath("//span[@id='select2-shipping_country-container']")).click();
		Thread.sleep(1000);
		country.selectByIndex(41);
		assertEquals(country.getFirstSelectedOption().getText(), "Canada");
	
		
		Select province = new Select(driver.findElement(By.id("shipping_state")));
		driver.findElement(By.xpath("//span[@id='select2-shipping_state-container']")).click();
		Thread.sleep(1000);
		province.selectByValue("NL");
		assertEquals(province.getFirstSelectedOption().getText(), "Newfoundland and Labrador");
	}
	
}


