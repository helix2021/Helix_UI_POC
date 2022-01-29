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

private By btn_budget = By.xpath("//button[text()='Budget']");

private By lable_proj_admin = By.xpath("//strong[text()= 'Project Administration']");
private By btn_view_edit = By.xpath("//input[contains(@value, 'View/Edit')]");
private By btn_fee_clause = By.xpath("//button[text()='Fee Clauses']");

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
private By fld_chase_card_limit = By.xpath("//input[@ng-model='ChaseCardLimit']");

//Budget section fields
//Item
private By fld_item_hono_avg_qntity = By.xpath("//td[text()='Assumes 1 honoraria']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_item_hono_avg_unit = By.xpath("//td[text()='Assumes 1 honoraria']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_item_hono_avg_Budget_Estimate = By.xpath("//th/b[text()='Budget Estimate']/following::tr[1]/td[5]");
private By fld_item_airfare_qntity = By.xpath("//td[text()='Speaker Airfare ']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_item_airfare_unit = By.xpath("//td[text()='Speaker Airfare ']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_item_airfare_Budget_Estimate = By.xpath("//th/b[text()='Budget Estimate']/following::tr[2]/td[5]");
private By fld_item_speaker_ground_transport_qntity = By.xpath("//td[text()='Speaker Ground']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_item_speaker_ground_transport_unit = By.xpath("//td[text()='Speaker Ground']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_item_speaker_ground_transport_Budget_Estimate = By.xpath("//th/b[text()='Budget Estimate']/following::tr[3]/td[5]");
private By fld_item_speaker_TnE_qntity = By.xpath("//td[text()='Speaker Expenses']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_item_speaker_TnE_unit = By.xpath("//td[text()='Speaker Expenses']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_item_speaker_TnE_Budget_Estimate = By.xpath("//th/b[text()='Budget Estimate']/following::tr[4]/td[5]");
private By fld_item_speaker_lodging_qntity = By.xpath("//td[text()='Speaker Lodging']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_item_speaker_lodging_unit = By.xpath("//td[text()='Speaker Lodging']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_item_speaker_lodging_Budget_Estimate = By.xpath("//th/b[text()='Budget Estimate']/following::tr[5]/td[5]");
private By fld_item_ven_fd_bevarage_qntity = By.xpath("//td[text()='Food and Beverage']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_item_ven_fd_bevarage_unit = By.xpath("//td[text()='Food and Beverage']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_item_ven_fd_bevarage_Budget_Estimate = By.xpath("//th/b[text()='Budget Estimate']/following::tr[6]/td[5]");

//Budget section fields
//Item
private By fld_fee_items_mngmnt_fee_qntity = By.xpath("//td[text()='Management Fee']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_fee_items_mngmnt_fee_unit = By.xpath("//td[text()='Management Fee']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_fee_items_mngmnt_fee_Budget_Estimate = By.xpath("//tr/th[text()='Fee Items']/following::tr[1]/td[5]");
private By fld_fee_items_late_fee_qntity = By.xpath("//td[text()='Late Fee']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_fee_items_late_fee_unit = By.xpath("//td[text()='Late Fee']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_fee_items_late_fee_Budget_Estimate = By.xpath("//tr/th[text()='Fee Items']/following::tr[2]/td[5]");
private By fld_fee_items_cancel_fee_qntity = By.xpath("//td[text()='Cancellation Fee']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_fee_items_cancel_fee_unit = By.xpath("//td[text()='Cancellation Fee']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_fee_items_cancel_fee_Budget_Estimate = By.xpath("//tr/th[text()='Fee Items']/following::tr[3]/td[5]");
private By fld_fee_items_onsite_planner_qntity = By.xpath("//td[text()='Onsite Planner']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_fee_items_onsite_planner_unit = By.xpath("//td[text()='Onsite Planner']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_fee_items_onsite_planner_Budget_Estimate = By.xpath("//tr/th[text()='Fee Items']/following::tr[4]/td[5]");
private By fld_fee_items_audio_visual_qntity = By.xpath("//td[text()='Audio Visual']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_fee_items_audio_visual_unit = By.xpath("//td[text()='Audio Visual']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_fee_items_audio_visual_Budget_Estimate = By.xpath("//tr/th[text()='Fee Items']/following::tr[5]/td[5]");
private By fld_fee_items_virtual_host_qntity = By.xpath("//td[text()='Virtual Host']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_fee_items_virtual_host_unit = By.xpath("//td[text()='Virtual Host']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_fee_items_virtual_host_Budget_Estimate = By.xpath("//tr/th[text()='Fee Items']/following::tr[6]/td[5]");
private By fld_fee_items_catering_fee_qntity = By.xpath("//td[text()='Catering Fee']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_fee_items_catering_fee_unit = By.xpath("//td[text()='Catering Fee']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_fee_items_catering_fee_Budget_Estimate = By.xpath("//tr/th[text()='Fee Items']/following::tr[7]/td[5]");
private By fld_fee_items_virtual_catering_fee_qntity = By.xpath("//td[text()='Virtual Catering Fee']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_fee_items_virtual_catering_fee_unit = By.xpath("//td[text()='Virtual Catering Fee']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_fee_items_virtual_catering_fee_Budget_Estimate = By.xpath("//tr/th[text()='Fee Items']/following::tr[8]/td[5]");
private By fld_fee_items_Honoraria_Fee_qntity = By.xpath("//td[text()='Honoraria Fee']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_fee_items_Honoraria_Fee_unit = By.xpath("//td[text()='Honoraria Fee']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_fee_items_Honoraria_Fee_Budget_Estimate = By.xpath("//tr/th[text()='Fee Items']/following::tr[9]/td[5]");
private By fld_fee_items_mileage_qntity = By.xpath("//td[text()='Mileage']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_fee_items_mileage_unit = By.xpath("//td[text()='Mileage']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_fee_items_mileage_Budget_Estimate = By.xpath("//tr/th[text()='Fee Items']/following::tr[10]/td[5]");
private By fld_fee_items_circuit_qntity = By.xpath("//td[text()='Circuit']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_fee_items_circuit_unit = By.xpath("//td[text()='Circuit']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_fee_items_circuit_Budget_Estimate = By.xpath("//tr/th[text()='Fee Items']/following::tr[11]/td[5]");
private By fld_fee_items_Travel_Honoraria_qntity = By.xpath("//td[text()='Travel Honoraria']/following-sibling::td/input[@ng-model='item.Qty']");
private By fld_fee_items_Travel_Honoraria_unit = By.xpath("//td[text()='Travel Honoraria']/following-sibling::td/input[@ng-model='item.Unit']");
private By fld_fee_items_Travel_Honoraria_Budget_Estimate = By.xpath("//tr/th[text()='Fee Items']/following::tr[12]/td[5]");



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
private By fld_CCHFC1LessDays = By.xpath("//input[@ng-model='CFTC1LessDays']");
private By dd_CCHFC1 = By.xpath("//input[@ng-model='HCFTC1LessDays']/following-sibling::select[@ng-model='HCFTC1DaysType']");
private By dd_CCHFC2 = By.xpath("//input[@ng-model='HCFTC1GreaDays']/following-sibling::select[@ng-model='HCFTC1DaysType']");
private By fld_CCHFC1GREsDays = By.xpath("//input[@ng-model='CFTC1GreaDays']");
private By fld_CCHFC1PerKDays = By.xpath("//input[@ng-model='CFTC1Perc']");
private By fld_CCHFC2DollDays = By.xpath("//input[@ng-model='CFTC1Perc']");
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
private By fld_GT_THT = By.xpath("//input[@ng-model='THTC1T1Miles']");
private By fldAM_THT = By.xpath("//input[@ng-model='THTC1T1MilesDoll']");
private By fld_LS_THT = By.xpath("//input[@ng-model='THTC1T1Hours']");
private By fld_HRS_THT = By.xpath("//input[@ng-model='THTC1T1HoursDoll']");
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
	
	public void clickOnBudgetButton() throws InterruptedException
	{
		utils.clickOnElement(btn_budget, driver);
		Thread.sleep(4000);
		System.out.println("Budget button got clicked");
	}
	
	public void clickOnFeeClauseButton() throws InterruptedException
	{
		utils.clickOnElement(btn_fee_clause, driver);
		Thread.sleep(4000);
		System.out.println("Budget button got clicked");
	}
	
	public void fillProgramFeeBreakDown() throws IOException, InterruptedException
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
		utils.enterText(fld_chase_card_limit,driver, config.getValueFromExcel(1, 10));
		System.out.println("Entered tha Program Fee Values");
	}
	
	public void fillFeeClause() throws IOException, InterruptedException
	{
		utils.enterText(fld_LSFC1LessDays, driver, config.getValueFromExcel(1, 47));
		utils.enterText(fld_LSFC1GREsDays, driver, config.getValueFromExcel(1, 48));
		utils.enterText(fld_LSFC1PerKDays, driver, config.getValueFromExcel(1, 49));
		utils.enterText(fld_LSFC2PerKDays, driver, config.getValueFromExcel(1, 50));
		utils.enterText(fld_CFTC1LessDays, driver, config.getValueFromExcel(1, 51));
		utils.enterText(fld_CFTC1GREsDays, driver, config.getValueFromExcel(1, 52));
		utils.enterText(fld_CFTC1PerKDays, driver, config.getValueFromExcel(1, 53));
		utils.enterText(fld_CFTC2PerKDays, driver, config.getValueFromExcel(1, 54));
		utils.enterText(fld_CCHFC1LessDays, driver, config.getValueFromExcel(1, 55));
		utils.enterText(fld_CCHFC1GREsDays, driver, config.getValueFromExcel(1, 56));
		utils.enterText(fld_CCHFC1PerKDays, driver, config.getValueFromExcel(1, 57));
		utils.enterText(fld_CCHFC2DollDays, driver, config.getValueFromExcel(1, 58));
		utils.enterText(fld1_VH, driver, config.getValueFromExcel(1, 59));
		utils.enterText(fld2_VH, driver, config.getValueFromExcel(1, 60));
		utils.enterText(fld1_CF, driver, config.getValueFromExcel(1, 61));
		utils.enterText(fld2_CF, driver, config.getValueFromExcel(1, 62));
		utils.enterText(fld1_OF, driver, config.getValueFromExcel(1, 63));
		utils.enterText(fld2_OF, driver, config.getValueFromExcel(1, 64));
		utils.enterText(fld3_OF, driver, config.getValueFromExcel(1, 65));
		utils.enterText(fld1_VCF, driver, config.getValueFromExcel(1, 66));
		utils.enterText(fld2_VCF, driver, config.getValueFromExcel(1, 67));
		utils.enterText(fld1_GSP, driver, config.getValueFromExcel(1, 68));
		utils.enterText(fld2_LSP, driver, config.getValueFromExcel(1, 69));
		utils.enterText(fld_SPPerKDays, driver, config.getValueFromExcel(1, 70));
		utils.enterText(fld_SPDollDays, driver, config.getValueFromExcel(1, 71));
		utils.enterText( fld1_ML, driver, config.getValueFromExcel(1, 72));
		utils.enterText( fld2_ML, driver, config.getValueFromExcel(1, 73));
		utils.enterText( fld3_ML, driver, config.getValueFromExcel(1, 74));
		utils.enterText(textara_Circuit, driver, config.getValueFromExcel(1, 75));
		utils.enterText(fld_GT_THT, driver, config.getValueFromExcel(1, 76));
		utils.enterText(fldAM_THT, driver, config.getValueFromExcel(1, 77));
		utils.enterText(fld_LS_THT, driver, config.getValueFromExcel(1, 78));
		utils.enterText(fld_HRS_THT, driver, config.getValueFromExcel(1, 79));
		System.out.println("Entered tha Program Fee Values");
	}
	
	public void fillBudgetDetails() throws IOException, InterruptedException
	{
		//Budget section fields
		//Item
		utils.enterText(fld_item_hono_avg_qntity, driver, config.getValueFromExcel(1, 11));
		utils.enterText(fld_item_hono_avg_unit, driver, config.getValueFromExcel(1, 12));
		utils.enterText(fld_item_airfare_qntity, driver, config.getValueFromExcel(1, 13));
		utils.enterText(fld_item_airfare_unit, driver, config.getValueFromExcel(1, 14));
		utils.enterText(fld_item_speaker_ground_transport_qntity, driver, config.getValueFromExcel(1, 15));
		utils.enterText(fld_item_speaker_ground_transport_unit, driver, config.getValueFromExcel(1, 16));
		utils.enterText(fld_item_speaker_TnE_qntity, driver, config.getValueFromExcel(1, 17));
		utils.enterText(fld_item_speaker_TnE_unit, driver, config.getValueFromExcel(1, 18));
		utils.enterText(fld_item_speaker_lodging_qntity, driver, config.getValueFromExcel(1, 19));
		utils.enterText(fld_item_speaker_lodging_unit, driver, config.getValueFromExcel(1, 20));
		utils.enterText(fld_item_ven_fd_bevarage_qntity, driver, config.getValueFromExcel(1, 21));
		utils.enterText(fld_item_ven_fd_bevarage_unit, driver, config.getValueFromExcel(1, 22));

		//Budget section fields
		//Item
		utils.enterText(fld_fee_items_mngmnt_fee_qntity, driver, config.getValueFromExcel(1, 23));
		utils.enterText(fld_fee_items_mngmnt_fee_unit, driver, config.getValueFromExcel(1, 24));
		utils.enterText(fld_fee_items_late_fee_qntity, driver, config.getValueFromExcel(1, 25));
		utils.enterText(fld_fee_items_late_fee_unit, driver, config.getValueFromExcel(1, 26));
		utils.enterText(fld_fee_items_cancel_fee_qntity, driver, config.getValueFromExcel(1, 27));
		utils.enterText(fld_fee_items_cancel_fee_unit, driver, config.getValueFromExcel(1, 28));
		utils.enterText(fld_fee_items_onsite_planner_qntity, driver, config.getValueFromExcel(1, 29));
		utils.enterText(fld_fee_items_onsite_planner_unit, driver, config.getValueFromExcel(1, 30));
		utils.enterText(fld_fee_items_audio_visual_qntity, driver, config.getValueFromExcel(1, 31));
		utils.enterText(fld_fee_items_audio_visual_unit, driver, config.getValueFromExcel(1, 32));
		utils.enterText(fld_fee_items_virtual_host_qntity, driver, config.getValueFromExcel(1, 33));
		utils.enterText(fld_fee_items_virtual_host_unit, driver, config.getValueFromExcel(1, 34));
		utils.enterText(fld_fee_items_catering_fee_qntity, driver, config.getValueFromExcel(1, 35));
		utils.enterText(fld_fee_items_catering_fee_unit, driver, config.getValueFromExcel(1, 36));
		utils.enterText(fld_fee_items_virtual_catering_fee_qntity, driver, config.getValueFromExcel(1, 37));
		utils.enterText(fld_fee_items_virtual_catering_fee_unit, driver, config.getValueFromExcel(1, 38));
		utils.enterText(fld_fee_items_Honoraria_Fee_qntity, driver, config.getValueFromExcel(1, 39));
		utils.enterText(fld_fee_items_Honoraria_Fee_unit, driver, config.getValueFromExcel(1, 40));
		utils.enterText(fld_fee_items_mileage_qntity, driver, config.getValueFromExcel(1, 41));
		utils.enterText(fld_fee_items_mileage_unit, driver, config.getValueFromExcel(1, 42));
		utils.enterText(fld_fee_items_circuit_qntity, driver, config.getValueFromExcel(1, 43));
		utils.enterText(fld_fee_items_circuit_unit, driver, config.getValueFromExcel(1, 44));
		utils.enterText(fld_fee_items_Travel_Honoraria_qntity, driver, config.getValueFromExcel(1, 45));
		utils.enterText(fld_fee_items_Travel_Honoraria_unit, driver, config.getValueFromExcel(1, 46));

		
	}
}
