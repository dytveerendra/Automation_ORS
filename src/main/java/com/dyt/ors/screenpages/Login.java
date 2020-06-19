package com.dyt.ors.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class Login extends WebLibrary{	
	
	//=========WebElements for Login page==================
	@FindBy(xpath="//input[@name='loginId']")
	public static WebElement edit_UserName;	
	
	@FindBy(xpath="//input[@name='loginPwd']")
	public static WebElement edit_Password;
	
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement btn_Login;	
	
	//=================Login methods=========================
	
	public static void loginApp(String user, String password) {			
		
		boolean bStatus;		
		bStatus = setEditValue(edit_UserName, user);
		Reporter.log(bStatus, "Username entered", "Username not entered");
				
		bStatus = setEditValue(edit_Password, password);
		Reporter.log(bStatus, "Password entered", "Password not entered");		
		
		bStatus = clickElement(btn_Login);
		Reporter.log(bStatus, "Login button clicked", "Login button not clicked");
	}
}
