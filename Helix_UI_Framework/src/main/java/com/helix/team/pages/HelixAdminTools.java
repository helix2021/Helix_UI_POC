package com.helix.team.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelixAdminTools {

	private WebDriver driver;
	private boolean isAdminToolsLableVisible = false;
	private By label_admin_tool = By.xpath("//div[contains(text(),'Admin Tools')]");
	private By btn_project_admin = By.xpath("//input[@value='Project Admin']");
	
	public HelixAdminTools(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public boolean doValidateLabel()
	{
		if(driver.findElement(label_admin_tool).getText().equalsIgnoreCase("Admin Tools"))
		{
			isAdminToolsLableVisible = true;
		}
		return isAdminToolsLableVisible;
	}
	
	public void clickOnProjectAdminBtn()
	{
		driver.findElement(btn_project_admin).click();
	}

}
