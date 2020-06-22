package com.dyt.ors.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class Home extends WebLibrary{
	
	@FindBy(xpath="//a[text()='Login']")
	public static WebElement link_Login;
	
	@FindBy(xpath="//a[text()='Register']")
	public static WebElement link_Register;
	
	//===========================================
	public static void navLoginpage() {		
		boolean bStatus = clickElement(link_Login);
		Reporter.log(bStatus, "Login link clicked", "Login link not clicked");
	}	
	
	
	//===========================================
}