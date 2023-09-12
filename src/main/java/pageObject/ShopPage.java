package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ShopPage {
	
	public WebDriver driver;
	
	
	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By orderDropDown = By.xpath("//select[@class='orderby']");
	public By priceSliderInitalPosition = By.xpath("//span[@style='left: 0%;']");
	public By priceSliderFinalPosition = By.xpath("//span[@style='left: 100%;']");
	
	public By bookCookingWithLove = By.xpath("//a[contains(text(), 'Cooking with love')]");
	public By titleBookCookingWithLove = By.xpath("//h1[contains(text(), 'Cooking with love')]");
	public By productGalleryTrigger = By.xpath("//div[@class='woocommerce-product-gallery__image']");
	public By rating = By.xpath("//div[@class='star-rating']");
	public By price = By.xpath("//span[bdi='$18.49']/../../del/child::*/bdi");
	

	//metode specifice
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
	public boolean checkTitleleBookCookingWithLovePresent() {
		return driver.findElement(titleBookCookingWithLove).isDisplayed();
		     }	
	
	
	public boolean checkProductGalleryTriggerPresent() {
		return driver.findElement(productGalleryTrigger).isDisplayed();
		     }	
	
	public boolean checkRatingPresent() {
		return driver.findElement(rating).isDisplayed();
		     }	
	
	public boolean checkPricePresent() {
		return driver.findElement(price).isDisplayed();
		     }	
	
	
	
	
	public void dragAndDrop(By locator, int x, int y) {
		WebElement element =  driver.findElement(locator);
		Actions action = new Actions(driver);
		//action.dragAndDropBy(element, x, y).perform();
		action.moveToElement(element).clickAndHold(element).moveByOffset(x, y).release().perform();

	}
	
	
	
	public void filterByValue(String value) {
		WebElement element =  driver.findElement(orderDropDown);
		Select dropdown =  new Select(element);
		dropdown.selectByValue(value);
		
	}
	
	public void filterByVisibleText(String value) {
		WebElement element =  driver.findElement(orderDropDown);
		Select dropdown =  new Select(element);
		dropdown.selectByVisibleText(value);
		
	}
	
	
	public void filterByIndex(int index) {
		WebElement element =  driver.findElement(orderDropDown);
		Select dropdown =  new Select(element);
		dropdown.selectByIndex(index);
		
	}
	
	
	public String getCurrentSelectedOption() {
		WebElement element =  driver.findElement(orderDropDown);
		Select dropdown =  new Select(element);
		return dropdown.getFirstSelectedOption().getText();
	}
	
	

}