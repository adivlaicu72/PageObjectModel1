package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample3 extends BaseTest{
	
	
	
	@Test
	public void xpathExample3() {
		
		driver.findElement(By.linkText("BOOKS")).click();
		
		////span[bdi='$14.99']
		
		
		
		//select and go back one level and down on specific sibling 
		//bdi[contains(text(), '14.99')]/../../following-sibling::a
		
		
		////span[bdi='$11.50']/../../del/child::*/bdi
		
		
		////*[self::span or self::a][contains(@class, 'page-numbers') and not(contains(text(), '1') or contains(text(), '2'))]
		
		//atunci cand vreau ultimul element dar nu pot sa ma bazez pe index
		//h2[@class='woocommerce-loop-product__title'])[last()-1]  --> ultimul
		//h2[@class='woocommerce-loop-product__title'])[last()-1] --> penultimul
		
		
		//similar cu index este si pozition()
		//--> (//h2[@class='woocommerce-loop-product__title'])[position()=13]
				
	}

}