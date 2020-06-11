package com.dyt.ors.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;

public class Login extends WebLibrary{	
	
	//=========WebElements for Login page==================
	@FindBy(xpath="//input[@name='loginId']")
	public static WebElement edit_UserName;	
	
	@FindBy(xpath="//input[@name='loginPwd']")
	public static WebElement edit_Password;
	
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement btn_Login;
	
	
	//=================Login methods=========================
	
	public static void loginApp() {		
		
		boolean retval;
		launchApp();
		
		retval = setEditValue(edit_UserName, "user02");
		if(retval)
			System.out.println("Username entered");
		else
			System.out.println("Username not entered");
		
		retval = setEditValue(edit_Password, "pass1234");
		if(retval)
			System.out.println("Password entered");
		else
			System.out.println("Password not entered");
		
		retval = clickElement(btn_Login);
		if(retval)
			System.out.println("Login button clicked");
		else
			System.out.println("Login button not clicked");
	}
	
	

}
