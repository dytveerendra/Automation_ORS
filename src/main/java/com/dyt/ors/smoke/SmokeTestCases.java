package com.dyt.ors.smoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.dyt.generic.BaseClass;
import com.dyt.ors.screenpages.Home;
import com.dyt.ors.screenpages.Login;
import com.dyt.utilities.ExcelLib;

public class SmokeTestCases extends BaseClass{
	
	@Test
	public static void TC001_addMainCategory()
	{		
		String[] data = ExcelLib.getRowData("TC001_addMainCategory", Smoke_Sheet);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		//Step 1: Login as an admin
		Home.navLoginpage();
		login.loginApp(data[0],data[1]);
		
		//Step 2: Navigate to Main Category page		
		
		
		// Step n : Logout		
	}
	
	@Test
	public static void TC002_addMainCategory()
	{		
		String[] data = ExcelLib.getRowData("TC001_addMainCategory", Smoke_Sheet);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		//Step 1: Login as an admin
		Home.navLoginpage();
		login.loginApp(data[0],data[1]);
		
		//Step 2: Navigate to Main Category page		
		
		
		// Step n : Logout		
	}

}
