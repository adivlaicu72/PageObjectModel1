package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import utils.BaseTest;

public class XpathExample extends BaseTest {

	@Test(priority = 1)
	public void xpathExample() {

		//<li class="menu_user_login">
		//--> li[class='menu_user_login']  --> CSS
		//--> //li[@class = 'menu_user_login'] --> XPath
		
		driver.findElement(By.xpath("//li[@class = 'menu_user_login']")).click();
		//OR
		driver.findElement(By.xpath("//input[@id='log' or @name='log']")).sendKeys("TestUser");
		//AND
		driver.findElement(By.xpath("//input[@id='password' and @name='pwd']")).sendKeys("12345@67890");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	}
	
	@Test(priority=2)
	public void xpathExample2() {
		driver.findElement(By.xpath("//span[@class='user_name']")).click();
		
		//<a href="https://keybooks.ro/wp-admin/profile.php" class="icon icon-cog">Settings</a>	
		// text() --> citeste textul dintre tagurile html. pe elementul de mai sus, citeste Settings
		driver.findElement(By.xpath("//a[text() = 'Settings']")).click();
		
		//<a href="https://keybooks.ro/account/orders/">recent orders</a>
		
		// xpath -->  //a[contains(text(), 'orders')] --> poti pune text partial
		// xpath -->  //a[text()= 'recent orders'] --> trebuie tot textul dintre taguri
		
		driver.findElement(By.xpath("//a[contains(text(), 'orde')]")).click();
		
		//th[contains(@class, 'woocommerce-orders-table__header')]
		//echivlent cu css-ul =>
		//th[class*='woocommerce-orders-table__header')]
		
		//th[contains(@class, 'woocommerce-orders-table')]/span[contains(text(), 'Order')]
		
		//jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:5px solid red')", price10_20);
		
		(//th[contains(@class, 'woocommerce-orders-table')]/span)[3]
		WebElement orderTabHeader = driver.findElement(By.xpath("//th[contains(@class, 'woocommerce-orders-table')]/span[contains(text(), 'Order')]"));
		
	}
	
	
}