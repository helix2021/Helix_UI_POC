package com.helix.team.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.helix.team.utils.ElementUtils;

public class HelixLoginPage extends ElementUtils{
	
	
	
	By tbx_username_login = By.xpath("//input[@value='Email address']");
	
	By tbx_password_login = By.xpath("//input[@id='ctl00_BodyContent_TextBoxPassword_I_CLND']");
	
	By btn_loin_login = By.xpath("//button[@value='Login']");
	
	By txt_login_page_word = By.xpath("//div[text()='Login Page']");
	
	By passwordLink = By.xpath("//a[text()='Forgot Your Password?']");
	
	
	private WebDriver driver;
	public String ForgotLinkDisplayed = null;
	
	public HelixLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getHelixloginPageTitle()
	{
		return driver.getTitle();
	}
	
	public String isForgotPasswordLinkExists()
	{
		ForgotLinkDisplayed = driver.findElement(passwordLink).getText();
		return ForgotLinkDisplayed;
	}
	
	public void enterUN(String username) throws InterruptedException
	{
		driver.findElement(tbx_username_login).sendKeys(username);
		Thread.sleep(3000);
	}
	
	public void enterPassword(String password) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.click(driver.findElement(tbx_password_login));
		act.sendKeys(password).build().perform();
		Thread.sleep(3000);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(btn_loin_login).click();
	}
	
	
	
	public HelixMeetingListPage doLogin(String username, String password) throws InterruptedException
	{
		driver.findElement(tbx_username_login).sendKeys(username);
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.click(driver.findElement(tbx_password_login));
		act.sendKeys(password).build().perform();
		Thread.sleep(3000);
		driver.findElement(btn_loin_login).click();
		return new HelixMeetingListPage(driver);
	}
	

}
