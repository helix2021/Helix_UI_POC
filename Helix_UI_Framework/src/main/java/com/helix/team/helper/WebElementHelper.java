package com.helix.team.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementHelper {

    private WebDriver driver;
    WaitHelper waitHelper = new WaitHelper();
    private int timeOutInSeconds = 10;
//    public WebElementHelper(WebDriver driver)
//    {
//        this.driver=driver;
//    }

    public void setText(WebDriver driver, By locator, String text) {
        WebElement ele = driver.findElement(locator);
        ele.sendKeys(text);
    }

    public void waitEnterText(WebDriver driver, By locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        WebElement ele = driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(ele));
        ele.sendKeys(text);
    }


    public void setTextAndEnter(WebDriver driver, By locator, String text) {
        WebElement ele = driver.findElement(locator);
        ele.sendKeys(text);
    }

    public void scrollAndEnterText(WebDriver driver, By locator, String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", locator);
        WebElement ele = driver.findElement(locator);
        ele.sendKeys(text);
    }
}
