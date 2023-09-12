package tests;

import org.testng.annotations.Test;

import pageObject.MenuPage;
import utils.BaseTest;

public class C21_Homework extends BaseTest{
	
	@Test
	public void hoverTest() throws InterruptedException {
		MenuPage menu =  new MenuPage(driver);
		menu.hoverElement(menu.blogLink);
		Thread.sleep(3000);
		menu.hoverElement(menu.blogSubMenuPostFormats);
		Thread.sleep(3000);
		menu.navigateTo(menu.blogSubMenuPostFormats);
		menu.navigateTo(menu.audioPost);
		
		//menu.navigateTo(menu.playButton);
		menu.dragAndDrop(menu.volumeSliderPosition, 50, 0);
		menu.dragAndDrop(menu.musicSliderPosition, 30, 0);
		
		
	}

}
