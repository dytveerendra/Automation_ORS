package com.dyt.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.dyt.ors.config.Config;
//================================================================
/*
Name			: WebLibrary
Description 	: It has all the reusable(generic) methods to work with web applications
Author			: DevelopYou Technologies
Date			: 08th June 2020
Modified Date	:
Modified By		:
*/
public class WebLibrary extends Config{	
	//================================================================	
	/*
	Name: setEditValue
	Description		: 	To set value to edit box
	Author			: 	DevelopYou Technologies
	Date			: 	08th June 2020
	Parameters		: 	elexpath -> edit box xpath, value -> Input value to edit box
	Modified Date	:	09th June 2020
	Modified By		:
	*/
	public static boolean setEditValue(WebElement element, String value) {
		boolean bStatus = true;
		try {
			element.sendKeys(value);
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//==================================================================
	public static boolean clickElement(WebElement element) {
		boolean bStatus = true;
		try {
			element.click();
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//================================================================================
		public static boolean mouseHover(String elexpath) {
			boolean bStatus = true;
			try {
				Actions act = new Actions(driver);
				WebElement element =driver.findElement(By.xpath(elexpath));
				act.moveToElement(element).build().perform();
			}
			catch (Exception e) {
				bStatus = false;
			}
			return bStatus;
		}
	//=============================================================================
	public static boolean dropDown(String elexpath,String value) {
		boolean bStatus = true;
		try {
			WebElement element = driver.findElement(By.xpath(elexpath));
			Select sc = new Select(element);
			sc.selectByVisibleText(value);
			
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	
	//==========================================================================================
	public static boolean setValueEscape(String elexpath,String value) {
		boolean bStatus = true;
		try {
			WebElement editbox = driver.findElement(By.xpath(elexpath));
			editbox.clear();
			editbox.click();
			editbox.sendKeys(value);
			editbox.sendKeys(Keys.ESCAPE);			
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//================================================================================
	public static boolean verifyEditboxValue(String elexpath,String value) {
		boolean bStatus = true;
		try {
			String actValue = driver.findElement(By.xpath(elexpath)).getAttribute("value");
			if (!(actValue.equals(value))) {
				bStatus = false;
			}
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//================================================================================
	public static boolean verifyText(String elexpath) {
		boolean bStatus = true;
		try {
			driver.findElement(By.xpath(elexpath));
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//================================================================================
	public static boolean commentText(String elexpath, String value) {
		boolean bStatus = true;
		try {
			driver.findElement(By.xpath(elexpath)).sendKeys(value);
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//=============================================================================

}
