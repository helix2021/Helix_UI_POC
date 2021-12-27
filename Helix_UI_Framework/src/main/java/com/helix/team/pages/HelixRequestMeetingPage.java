package com.helix.team.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelixRequestMeetingPage {

    private WebDriver driver;
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


    //************************end*************************************/


    //************************page methods*************************************/
    //rajesh
    public void clickOnAdminToolsSection()
    {
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


    public HelixMeetingListPage getNewMeetingRequestHeaderValue() {
        waitForElement(header_new_meeting_request);
        getText(header_new_meeting_request);
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
