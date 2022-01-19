package com.helix.team.pages;

import com.helix.team.helper.WaitHelper;
import com.helix.team.helper.WebElementHelper;
import com.helix.team.utils.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelixRequestMeetingPage {

    private WebDriver driver;
    ElementUtils utils = new ElementUtils();
    WebElementHelper webElementHelper = new WebElementHelper();

    private HelixAdminTools adminTools;
    private By lnk_AdminTool = By.xpath("//a[@href='AdminTools.aspx']");

    private int timeOutInSeconds = 10;

    public HelixRequestMeetingPage(WebDriver driver) {
        this.driver = driver;
    }


//    public HelixRequestMeetingPage() {
//        PageFactory.initElements(driver, this);
//    }
//
    // *******************page objects***********************************

    //    private By link_new_meeting_request_tab = By.linkText("RequestMeeting.aspx");
    private By link_new_meeting_request_tab = By.xpath("//a[@href='RequestMeeting.aspx']");
    private By header_new_meeting_request = By.cssSelector("div.hlx-page-title");
    private By dropdwn_program = By.xpath("//select[contains(@name,'DropDownListClientProgram')]");
    private By dropdwn_meeting_type = By.xpath("//select[contains(@name,'DropDownListMeetingType')]");
    private By dropdwn_speaker_type = By.xpath("//select[contains(@name,'DropDownListIsSpeakerRemote')]");
    private By dropdwn_title = By.xpath("//select[contains(@name,'BodyContent$DropDownListTitle')]");
    private By dropdwn_meal_type = By.xpath("//select[contains(@name,'DropDownListMealType')]");
    private By input_event_city = By.xpath("//input[contains(@id,'BodyContent_TextBoxCity')]");
    private By dropdwn_state_list = By.xpath("//select[contains(@id,'BodyContent_DropDownListState')]");
    private By input_audiences_type = By.xpath("//input[contains(@id,'TextBoxAudienceTypeOther')]");
    private By input_first_choice_start_date = By.xpath("//input[contains(@id,'selDateTime1_calStartDate_textBox')]");

    //************************end*************************************/
    //************************page methods*************************************/
    //rajesh
    public void clickOnAdminToolsSection() {
        driver.findElement(lnk_AdminTool).click();
    }

    public HelixRequestMeetingPage validateIsWelcomeDisplayed(String welcomeMsg) {

        return new HelixRequestMeetingPage(driver);
    }
    //end//

    public HelixMeetingListPage clickOnMeetingRequestHeaderTab() {
        waitForElement(link_new_meeting_request_tab);
        clickOnElement(link_new_meeting_request_tab);
        return new HelixMeetingListPage(driver);
    }


    public String getNewMeetingRequestHeaderValue() {
        waitForElement(header_new_meeting_request);
        return getText(header_new_meeting_request);
    }

    public HelixMeetingListPage selectProgramValueDropdown(String value) {
        utils.selectValueFromDropDown(driver, dropdwn_program, value);
        return new HelixMeetingListPage(driver);
    }

    public HelixMeetingListPage selectMeetingTypeDropdown(String value) {
        utils.selectValueFromDropDown(driver, dropdwn_meeting_type, value);
        return new HelixMeetingListPage(driver);
    }

    public HelixMeetingListPage selectSpeakerTypeDropdown(String value) {
        utils.selectValueFromDropDown(driver, dropdwn_speaker_type, value);
        return new HelixMeetingListPage(driver);
    }

    public HelixMeetingListPage selectTitleDropdown(String value) {
        utils.selectValueFromDropDown(driver, dropdwn_title, value);
        return new HelixMeetingListPage(driver);
    }

    public HelixMeetingListPage selectMealTypeDropdown(String value) {
        utils.selectValueFromDropDown(driver, dropdwn_meal_type, value);
        return new HelixMeetingListPage(driver);
    }

    public HelixMeetingListPage enterEventCityVal(String value) {
        webElementHelper.setText(driver,input_event_city, value);
        return new HelixMeetingListPage(driver);
    }

    public HelixMeetingListPage selectStateListDropdown(String value) {
        utils.selectValueFromDropDown(driver, dropdwn_state_list, value);
        return new HelixMeetingListPage(driver);
    }

    public HelixMeetingListPage enterAudiencesTypes(String value) {
        this.setText(input_audiences_type, value);
        return new HelixMeetingListPage(driver);
    }

    public HelixMeetingListPage enterFirstChoiceStartDate(String value) {
        this.setText(input_first_choice_start_date, value);
        return new HelixMeetingListPage(driver);
    }

    public HelixMeetingListPage enterFirstChoiceStartDatejs(String value) {
        webElementHelper.scrollAndEnterText(driver, input_first_choice_start_date, value);
        return new HelixMeetingListPage(driver);
    }

    //**********************end ****************************************/
    //*************generic helper*********************//


    private void setText(By locator, String text) {
        WebElement ele = driver.findElement(locator);
        ele.sendKeys(text);
    }

    private String getText(By locator) {
        WebElement ele = driver.findElement(locator);
        return ele.getText();
    }

    private void clickOnElement(By locator) {
        WebElement ele = driver.findElement(locator);
        ele.click();
    }

    public void waitForElement(By element) {
        WebElement ele = driver.findElement(element);
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(ele));
    }

    //************************************//

}
