package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;
public class XpatxExample3 extends BaseTest {

	
	@Test
	public void xpathExample3() {
		
		driver.findElement(By.linkText("BOOKS")).click();
		
	}
}
