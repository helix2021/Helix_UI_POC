package com.helix.team.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.helix.team.utils.ConfigReader;
import com.helix.team.utils.ElementUtils;

public class HelixProjectAdminPage {
	
private WebDriver driver;
ElementUtils utils = new ElementUtils();
ConfigReader config = new ConfigReader();

private boolean isProjAdminIsvisible = false;

private By lable_proj_admin = By.xpath("//strong[text()= 'Project Administration']");
private By btn_view_edit = By.xpath("//input[contains(@value, 'View/Edit')]");

//Project Admin page text boxes
private By fld_job_code = By.xpath("//input[@placeholder='Enter Job Code']");
private By fld_sow_fee = By.xpath("//input[@ng-model='SOWFee']");
private By fld_speaker_Bureau1 = By.xpath("//input[@ng-model='SpeakerBureauPerc']");
private By fld_speaker_Bureau2 = By.xpath("//input[@ng-model='SpeakerBureauDoll']");
private By fld_Account_Service1 = By.xpath("//input[@ng-model='AccountServicePerc']");
private By fld_Account_Service2 = By.xpath("//input[@ng-model='AccountServiceDoll']");
private By fld_Breakfast = By.xpath("//input[@ng-model='GrubHubCreditsBF']");
private By fld_lunch = By.xpath("//input[@ng-model='GrubHubCreditsL']");
private By fld_dinner = By.xpath("//input[@ng-model='GrubHubCreditsD']");
private By fld_Others = By.xpath("//input[@ng-model='GrubHubCreditsOthers']");

//Late submision details
private By fld_LSFC1LessDays = By.xpath("//input[@ng-model='LSFC1LessDays']");
private By dd_LSFC1 = By.xpath("//input[@ng-model='LSFC1LessDays']/following-sibling::select[@ng-model='LSFC1DaysType']");
private By dd_LSFC2 = By.xpath("//input[@ng-model='LSFC1GreaDays']/following-sibling::select[@ng-model='LSFC1DaysType']");
private By fld_LSFC1GREsDays = By.xpath("//input[@ng-model='LSFC1GreaDays']");
private By fld_LSFC1PerKDays = By.xpath("//input[@ng-model='LSFC1Perc']");
private By fld_LSFC2PerKDays = By.xpath("//input[@ng-model='LSFC1Doll']");
private By rdBtn_LSFCDays = By.xpath("//input[@name='LSFType' and @value='Days']");
private By rdBtn_LSFCMilestone = By.xpath("//input[@name='LSFType' and @value='Milestone']");

//Cancellation fee terms
private By fld_CFTC1LessDays = By.xpath("//input[@ng-model='CFTC1LessDays']");
private By dd_CFTC1 = By.xpath("//input[@ng-model='CFTC1LessDays']/following-sibling::select[@ng-model='CFTC1DaysType']");
private By dd_CFTC2 = By.xpath("//input[@ng-model='CFTC1GreaDays']/following-sibling::select[@ng-model='CFTC1DaysType']");
private By fld_CFTC1GREsDays = By.xpath("//input[@ng-model='CFTC1GreaDays']");
private By fld_CFTC1PerKDays = By.xpath("//input[@ng-model='LSFC1Perc']");
private By fld_CFTC2PerKDays = By.xpath("//input[@ng-model='LSFC1Doll']");




	
	public HelixProjectAdminPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public boolean validateProjAdminLable()
	{
		if(driver.findElement(lable_proj_admin).getText().equals("Project Administration"))
		{
			isProjAdminIsvisible = true;
		}
		return isProjAdminIsvisible;
	}
	
	public void selectValueFromProjSeries(WebDriver driver,String name, String value)
	{
		utils.selectValueFromDropDown(this.driver, name, value);
	}
	
	public void selectValueFromEventType(WebDriver driver,String name, String value)
	{
		utils.selectValueFromDropDown(this.driver, name, value);
	}
	
	public void cliickOnViewEditbtn()
	{
		utils.clickOnElement(btn_view_edit, driver);
		System.out.println("View Edit button got clicked");
	}
	
	public void fillPageAdminDetails() throws IOException, InterruptedException
	{
		utils.enterText(fld_job_code, driver, config.getValueFromExcel(1, 0));
		utils.enterText(fld_sow_fee, driver, config.getValueFromExcel(1, 1));
		utils.enterText(fld_speaker_Bureau1, driver, config.getValueFromExcel(1, 2));
		utils.enterText(fld_speaker_Bureau2, driver, config.getValueFromExcel(1, 3));
		utils.enterText(fld_Account_Service1, driver, config.getValueFromExcel(1, 4));
		utils.enterText(fld_Account_Service2, driver, config.getValueFromExcel(1, 5));
		utils.enterText(fld_Breakfast, driver, config.getValueFromExcel(1, 6));
		utils.enterText(fld_lunch, driver, config.getValueFromExcel(1, 7));
		utils.enterText(fld_dinner, driver, config.getValueFromExcel(1, 8));
		utils.enterText(fld_Others, driver, config.getValueFromExcel(1, 9));
		System.out.println("Entered tha value");
	}
}
