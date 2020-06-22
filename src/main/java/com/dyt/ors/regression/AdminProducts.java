package com.dyt.ors.regression;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.dyt.generic.BaseClass;
import com.dyt.ors.screenpages.Dashboard;
import com.dyt.ors.screenpages.Home;
import com.dyt.ors.screenpages.Login;
import com.dyt.ors.screenpages.MainCategories;

public class AdminProducts extends BaseClass {

	@Test
	public static void TC001_addMainCategory()
	{		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		MainCategories maincategories = PageFactory.initElements(driver, MainCategories.class);
		
		//Step 1: Login as an admin
		Home.navLoginpage();
		login.loginApp("admin","admin@123");
		
		//Step 2: Navigate to Main Category page
		dashboard.navMainCategories();
		
		
		
		// Step n : Logout		
	}
	//=============================================
	@Test
	public static void TC002_addSubCategory()
	{		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		//Step 1: Login as an admin
		Home.navLoginpage();
		login.loginApp("admin","admin@123");
		
		
	}
	//=============================================
	@Test
	public static void TC003_addProduct()
	{		
		
		
	}
	//=============================================
	
	@Test
	public static void TC004_EditProductDetails()
	{		
		//Write a code here
		
	}
	//=============================================
	
}
