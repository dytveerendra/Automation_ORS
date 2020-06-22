package com.dyt.ors.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class Dashboard extends WebLibrary{
	
	//Elements
	@FindBy(xpath="//span[text()='Dashboard']")
	public static WebElement navlink_Dashboard;
	
	@FindBy(xpath="//span[text()='Products']")
	public static WebElement navlink_Products;	
	
	@FindBy(xpath="//a[text()='Main Categories']")
	public static WebElement link_MainCategories;
	
	@FindBy(xpath="//a[text()='Sub Categories']")
	public static WebElement link_SubCategories;
	
	@FindBy(xpath="//a[text()='Products']")
	public static WebElement link_Products;
			
	//================ Methods ====================
	public static void navMainCategories() {
		boolean bStatus;
		
		bStatus = clickElement(navlink_Products);
		Reporter.log(bStatus, "Products nav link clicked", "Products nav link not clicked");
		
		bStatus = clickElement(link_MainCategories);
		Reporter.log(bStatus, "Main Categories link clicked", "Main Categories link not clicked");		
	}
	//=======================================
	public static void navSubCategories() {
		boolean bStatus;
		
		bStatus = clickElement(navlink_Products);
		Reporter.log(bStatus, "Products nav link clicked", "Products nav link not clicked");
		
		bStatus = clickElement(link_SubCategories);
		Reporter.log(bStatus, "Sub Categories link clicked", "Sub Categories link not clicked");		
	}
	//=======================================
	public static void navProducts() {
		boolean bStatus;
		
		bStatus = clickElement(navlink_Products);
		Reporter.log(bStatus, "Products nav link clicked", "Products nav link not clicked");
		
		bStatus = clickElement(link_Products);
		Reporter.log(bStatus, "Products link clicked", "Products link not clicked");		
	}
	//=======================================

}
