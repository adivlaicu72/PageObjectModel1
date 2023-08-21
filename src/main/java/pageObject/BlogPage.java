package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BlogPage {
	
public WebDriver driver;
	
	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By blogDropDown = By.xpath("//li[@id='menu-item-114']");
	public By readMoreButton = By.xpath("//a[@class='sc_button sc_button_square sc_button_style_filled sc_button_size_small']");
	public By commentTextArea = By.id("comment");
	public By authorTextArea = By.id("author");
	public By emailTextArea = By.id("email");
	public By urlTextArea = By.id("url");
	public By postCommentButton = By.xpath("//input[@id='send_comment']");
	public By commentIsAwaitingModeration = By.xpath("//div[@class='comment_not_approved']");
	
	
	

	public void selectByVisibleText() {
		WebElement element =  driver.findElement(blogDropDown);
		Actions action = new Actions(driver);
		action.moveToElement(element).clickAndHold(element).release().perform();
	}
	
	public void clickReadMoreButton() {
		WebElement readMore =  driver.findElement(readMoreButton);
		readMore.click();
	}
	
	public void addComment() {
		WebElement comment =  driver.findElement(commentTextArea);
		comment.sendKeys("Test_Comment");
		
		WebElement author =  driver.findElement(authorTextArea);
		author.sendKeys("Adi Vlaicu");
		
		WebElement email =  driver.findElement(emailTextArea);
		email.sendKeys("adivlaicu@test.com");
		
		WebElement url =  driver.findElement(urlTextArea);
		url.sendKeys("https://keybooks.ro/2016/02/02/15-amazing-things-about-reading-in-the-fall/");	
		
	}	
	
	public void clickPostCommentButton() {
		WebElement postComment =  driver.findElement(postCommentButton);
		postComment.click();
	}
	
	public boolean checkcommentIsAwaitingModerationPresent() {
	return driver.findElement(commentIsAwaitingModeration).isDisplayed();
	     }	
	
}