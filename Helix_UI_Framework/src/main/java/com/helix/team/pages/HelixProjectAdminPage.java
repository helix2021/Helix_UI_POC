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
private By btn_LSF_Add = By.xpath("//input[@ng-click='AddLSFClause(LSFType)']");

//Cancellation fee terms
private By fld_CFTC1LessDays = By.xpath("//input[@ng-model='CFTC1LessDays']");
private By dd_CFTC1 = By.xpath("//input[@ng-model='CFTC1LessDays']/following-sibling::select[@ng-model='CFTC1DaysType']");
private By dd_CFTC2 = By.xpath("//input[@ng-model='CFTC1GreaDays']/following-sibling::select[@ng-model='CFTC1DaysType']");
private By fld_CFTC1GREsDays = By.xpath("//input[@ng-model='CFTC1GreaDays']");
private By fld_CFTC1PerKDays = By.xpath("//input[@ng-model='LSFC1Perc']");
private By fld_CFTC2PerKDays = By.xpath("//input[@ng-model='LSFC1Doll']");
private By btn_CFT_Add = By.xpath("//input[@ng-click='AddCFTClause(CFTType)']");

//Client Cancellation - Honoraria Fee Terms
private By fld_CCHFC1LessDays = By.xpath("//input[@ng-model='HCFTC1LessDays']");
private By dd_CCHFC1 = By.xpath("//input[@ng-model='HCFTC1LessDays']/following-sibling::select[@ng-model='HCFTC1DaysType']");
private By dd_CCHFC2 = By.xpath("//input[@ng-model='HCFTC1GreaDays']/following-sibling::select[@ng-model='HCFTC1DaysType']");
private By fld_CCHFC1GREsDays = By.xpath("//input[@ng-model='HCFTC1GreaDays']");
private By fld_CCHFC1PerKDays = By.xpath("//input[@ng-model='LSFC1Perc']");
private By fld_CCHFC2DollDays = By.xpath("//input[@ng-model='LSFC1Doll']");
private By btn_CCHF_Add = By.xpath("//input[@ng-click='AddHCFTClause()']");

//Virtual Host
private By Btn_VH = By.xpath("//input[@ng-click='AddVH()']");
private By fld1_VH = By.xpath("//input[@ng-model='VH1Perc']");
private By fld2_VH = By.xpath("//input[@ng-model='VH1Doll']");

//Catering Fee
private By Btn_CF = By.xpath("//input[@ng-click='AddCF()']");
private By fld1_CF = By.xpath("//input[@ng-model='CFAF1Perc']");
private By fld2_CF = By.xpath("//input[@ng-model='CFAF1Doll']");

//Other Fee
private By Btn_OF = By.xpath("//input[@ng-click='AddOF()']");
private By fld1_OF = By.xpath("//input[@ng-model='OFAF1Type']");
private By fld2_OF = By.xpath("//input[@ng-model='OFAF1Perc']");
private By fld3_OF = By.xpath("//input[@ng-model='OFAF1Doll']");

//Virtual Catering Fee
private By Btn_VCF = By.xpath("//input[@ng-click='AddVCF()']");
private By fld1_VCF = By.xpath("//input[@ng-model='VCFAF1Perc']");
private By fld2_VCF = By.xpath("//input[@ng-model='VCFAF1Doll']");

//Speaker
private By Btn_SP = By.xpath("//input[@ng-click='AddSHCFTClause()']");
private By fld1_GSP = By.xpath("//input[@ng-model='SHCFTC1GreaDays']");
private By fld2_LSP = By.xpath("//input[@ng-model='SHCFTC1LessDays']");
private By dd_SP1 = By.xpath("//input[@ng-model='SHCFTC1LessDays']/following-sibling::select[@ng-model='SHCFTC1DaysType']");
private By dd_SP2 = By.xpath("//input[@ng-model='SHCFTC1GreaDays']/following-sibling::select[@ng-model='SHCFTC1DaysType']");
private By fld_SPPerKDays = By.xpath("//input[@ng-model='SHCFTC1Perc']");
private By fld_SPDollDays = By.xpath("//input[@ng-model='SHCFTC1Doll']");

//Mileage
private By Btn_ML = By.xpath("//input[@ng-click='AddMTClause()']");
private By fld1_ML = By.xpath("//input[@ng-model='MTC1Miles']");
private By fld2_ML = By.xpath("//input[@ng-model='MTC1Perc']");
private By fld3_ML = By.xpath("//input[@ng-model='MTC1Doll']");

//Circuit
private By Btn_Add_circuit = By.xpath("//input[@ng-click='AddCT()']");
private By textara_Circuit = By.xpath("//textarea[@ng-model='CTC1Terms']");

//Travel Honoraria Term
private By Btn_Add1_THT = By.xpath("//input[@ng-click='AddTHT()']");
private By Btn_GT_THT = By.xpath("//input[@ng-model='THTC1T1Miles']");
private By Btn_AM_THT = By.xpath("//input[@ng-model='THTC1T1MilesDoll']");
private By Btn_LS_THT = By.xpath("//input[@ng-model='THTC1T1Hours']");
private By Btn_HRS_THT = By.xpath("//input[@ng-model='THTC1T1HoursDoll']");
private By Btn_Add2_THT = By.xpath("//input[@ng-click='AddTHTCT(1)']");
	
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
		
		System.out.println("Entered tha values in page admin");
	}
}
