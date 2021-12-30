package com.helix.team.utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementUtils {
	
	ConfigReader config = new ConfigReader();
	
	/*
	 * Auhtor: Rajesh Matadh
	 * Purpose: THis method is used to select value from any dropdown
	 */
	public void selectValueFromDropDown(WebDriver driver, String nameOftheSelectClass, String valueToSelect)
	{
		Select drpCountry = new Select(driver.findElement(By.name(nameOftheSelectClass)));
		drpCountry.selectByVisibleText(valueToSelect);
		System.out.println(valueToSelect + " This value is selected from the dropdown");
	}

	public void selectValueFromDropDown(WebDriver driver, By element, String valueToSelect)
	{
		Select drpCountry = new Select(driver.findElement(element));
		drpCountry.selectByVisibleText(valueToSelect);
		System.out.println(valueToSelect + " This value is selected from the dropdown");
	}
	
	/*
	 * 
	 */
	public void clickOnElement(By elementToclick, WebDriver driver)
	{
		driver.findElement(elementToclick).click();
	}
	
	/*
	 * 
	 */
	public void enterText(By elementToEnter, WebDriver driver, String dataToEnter) throws IOException, InterruptedException
	{
		driver.findElement(elementToEnter).clear();
		driver.findElement(elementToEnter).sendKeys(dataToEnter);
		Thread.sleep(2000);
	}
}
