package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JsExe_C24_Homework extends BaseTest{

	@Test
		public void socialFbIconTest() {
		driver.findElement(By.xpath("//span[@class='icon-facebook']")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		String Fb = jse.executeScript("return document.URL").toString();
		System.out.println("Page Title is : " + Fb);
		
		}
	
	//@Test
	public void socialTwitterIconTest() {
	driver.findElement(By.xpath("//span[@class='icon-twitter']")).click();
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	String Twitter = jse.executeScript("return document.URL").toString();
	 
	System.out.println("Page Title is : " + Twitter);
	
	}
	
	//@Test
	public void socialInstaIconTest() {
	driver.findElement(By.xpath("//span[@class='icon-instagramm']")).click();
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	String Insta = jse.executeScript("return document.URL").toString();
	 
	System.out.println("Page Title is : " + Insta);
	
	}
}
