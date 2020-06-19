package com.dyt.reports;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.dyt.ors.config.Config;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporter extends Config{
	
	public static ExtentReports extent;
	
	public static ExtentTest test;
	
	public static String resultfile;
	
	//==================================================================	
	public static void intializeReports()
	{			
		String resultfolder = createResultFolder();
		resultfile = resultfolder +"\\TestSummaryReport.html";
		extent = new ExtentReports(resultfile);	
		
		extent.addSystemInfo("Project Name","Orbit Science").
		addSystemInfo("Environment","SIT")
		.addSystemInfo("Sprint Name", "sprint1");		
	
		//extent.loadConfig(new File("extent.xml"));		
	}
	//==================================================================
	public static void startTest(String testcasename)
	{		
		test = extent.startTest(testcasename);
	}	
	//==================================================================
	public static void closeTest()
	{
		extent.endTest(test);		
	}
	//==================================================================
	public static void flushReport()
	{
		extent.flush();
	}
	//==================================================================
	public static void log(boolean status, String passMessage, String failMessage)
	{
		if(status)
			Reporter.logEvent("pass", passMessage);
		else
			Reporter.logEvent("fail", failMessage);
	}
	//==================================================================
	public static void logEvent(String status, String stepDescription)
	{		
		switch (status.toLowerCase()) {
		case "pass":			
			test.log(LogStatus.PASS, stepDescription+test.addScreenCapture(getScreenShot()));			
			break;
			
		case "fail":			
			test.log(LogStatus.FAIL, stepDescription+test.addScreenCapture(getScreenShot()));			
			break;
			
		case "warning":			
			test.log(LogStatus.WARNING, stepDescription+test.addScreenCapture(getScreenShot()));			
			break;
			
		case "info":			
			test.log(LogStatus.INFO, stepDescription);			
			break;	

		default:
			System.out.println("Invalid reporting status");
			break;
		}
		
	}
	//==================================================================
	
	public static String getScreenShot()
	{	
        TakesScreenshot sht = (TakesScreenshot) driver;       
		
		String screenshotfile = sht.getScreenshotAs(OutputType.BASE64);
		
		return "data:image/png;base64,"+ screenshotfile;
	}
	//==================================================================	
	
	public static String createResultFolder()
	{		
		Date d = new Date();
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());		
		File f = new File(ResultsPath + timeStamp.replace(".", "-"));
		 
		if(!f.exists())		
			f.mkdirs();
			
		String folderpath = ResultsPath + timeStamp.replace(".", "-");
		
		return folderpath;		
	}
	//==================================================================

}
