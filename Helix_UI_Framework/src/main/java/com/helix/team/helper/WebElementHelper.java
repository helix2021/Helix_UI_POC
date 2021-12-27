package com.helix.team.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementHelper {

    private WebDriver driver;

    public WebElementHelper(WebDriver driver)
    {
        this.driver=driver;
    }


    public void setText(By locator, String text) {

        WebElement ele = driver.findElement(locator);
        ele.sendKeys(text);
    }
}
