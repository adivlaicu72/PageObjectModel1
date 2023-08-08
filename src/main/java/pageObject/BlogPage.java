package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlogPage {
public WebDriver driver;
	
	
	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By blogDropDown = By.xpath("//li[@id='menu-item-76']");
	
	
	public void filterByValue(String value) {
		WebElement element =  driver.findElement(blogDropDown);
		Select dropdown =  new Select(element);
		dropdown.selectByValue(value);
		
	}
	
	public void filterByVisibleText(String value) {
		WebElement element =  driver.findElement(blogDropDown);
		Select dropdown =  new Select(element);
		dropdown.selectByVisibleText(value);
		
	}
	
	
	public void filterByIndex(int index) {
		WebElement element =  driver.findElement(blogDropDown);
		Select dropdown =  new Select(element);
		dropdown.selectByIndex(index);
		
	}
	
	
	public String getCurrentSelectedOption() {
		WebElement element =  driver.findElement(blogDropDown);
		Select dropdown =  new Select(element);
		return dropdown.getFirstSelectedOption().getText();
	}
	

}
