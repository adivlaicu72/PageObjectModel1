package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample2 extends BaseTest {
	
	@Test
	public void xpathExampleTest() {
		
		
		WebElement loginPopup = driver.findElement(
				By.xpath("//a[contains(@class, 'popup_login_link' )]/parent::li[@class='menu_user_login']"));
		
		
		loginPopup.click();
		
		
		
	}
	

}
