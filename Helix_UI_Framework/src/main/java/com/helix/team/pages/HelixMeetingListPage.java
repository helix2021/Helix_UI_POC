package com.helix.team.pages;

import com.helix.team.helper.WebElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelixMeetingListPage {
	
	private WebDriver driver;
	WebElementHelper webElementHelper = new WebElementHelper();
	private By lnkAdminToolsSection = By.xpath("//a[@href='AdminTools.aspx']");
	private By lblMeetingListHeader=By.xpath("//div[@class='pageTitle' and  contains(text(),'Meetings List')]");
	private By btnSearch=By.xpath("//a[@id='ctl00_BodyContent_lnbApplySearchFilter']");
	private By drpdownSearchBy=By.cssSelector("select[id='ctl00_BodyContent_ddlSearchFilterField']");
	private By inputMeetingDetailsEntry=By.cssSelector("input[id='ctl00_BodyContent_txtSearchFilterValue']");



	public HelixMeetingListPage(WebDriver driver)
	{
		this.driver = driver;
	}



	public HelixAdminTools clickOnAdminToolsSection()
	{
		driver.findElement(lnkAdminToolsSection).click();
		return new HelixAdminTools(driver);
	}

	public String getMeetingListHeaderText(){
		String meetingListHeaderText= driver.findElement(lblMeetingListHeader).getText();
		return meetingListHeaderText;
	}
	//Need to develop later
	public void selectSearchByDropdownList(){

	}

	public void  enterMeetingDetailsToSearch(String meetingDetailsToSearch){
		//webElementHelper.waitEnterText(inputMeetingDetailsEntry,meetingDetailsToSearch);
		driver.findElement(inputMeetingDetailsEntry).sendKeys(meetingDetailsToSearch);
		System.out.println("Entered the meeting search details: "+meetingDetailsToSearch+" successfully");

	}

	public void clickOnSearchButton() throws InterruptedException {
		driver.findElement(btnSearch).click();
		System.out.println("Clicked on Search button successfully");
		Thread.sleep(2000);

	}
	


}
