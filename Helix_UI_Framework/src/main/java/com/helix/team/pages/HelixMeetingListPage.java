package com.helix.team.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelixMeetingListPage {
	
	private WebDriver driver;
	private By lnkAdminToolsSection = By.xpath("//a[@href='AdminTools.aspx']");
	
	public HelixMeetingListPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public HelixAdminTools clickOnAdminToolsSection()
	{
		driver.findElement(lnkAdminToolsSection).click();
		return new HelixAdminTools(driver);
	}

}
