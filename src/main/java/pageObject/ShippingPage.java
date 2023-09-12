package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ShippingPage {
	
public WebDriver driver;
	
	public ShippingPage(WebDriver driver) {
		this.driver = driver;
		}

	//locatori
	//a[contains(text(), 'shipping and billing addresses')]
	public By userPlaceholder = By.cssSelector("span[class='user_name']");
	public By userSettings = By.cssSelector("a[class='icon icon-cog']");
	
	public By shippingbilling = By.xpath("//a[contains(text(), 'shipping and billing addresses')]");
	public By shippingbillingAddButton = By.xpath("//a[contains(@class, 'edit')][contains(text(), 'Add')]");
	
	
	
	//metode specifice
		public void navigateTo(By locator) {
			driver.findElement(locator).click();
		}
		
		
		public void hoverElement(By locator) {
			WebElement element =  driver.findElement(locator);
			Actions action =  new Actions(driver);
			action.moveToElement(element).doubleClick(element).perform();
		}
		
}