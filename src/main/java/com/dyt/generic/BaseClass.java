package com.dyt.generic;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.dyt.ors.config.Config;
import com.dyt.reports.Reporter;

public class BaseClass extends Config {
	
		//========================================================================	
		@BeforeSuite
		public void setupReport()
		{
			System.out.println("******  Intializing Test Suite *******");		
			Reporter.intializeReports();
			
			System.out.println("******  Test Suite is intialized sucessfully *******");
		}	
		//========================================================================
		@BeforeMethod
		public void launchBrowser(Method method)  throws IOException {		
			CurrentTestCaseName = method.getName();
			Reporter.startTest(CurrentTestCaseName);
			System.out.println("<<TestStart>> TestCase Name   " + CurrentTestCaseName + "  <<TestStart>>");
			Browser = Browser.toUpperCase();
			
			switch(Browser)
			{
				case "FF":				
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//servers//geckodriver.exe");
						driver = new FirefoxDriver();				  
				  break;
			
				case "IE":				
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//servers//IEDriverServer.exe");
					driver = new InternetExplorerDriver();				 
					break; 
				  
				case "CHROME":
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//servers//chromedriver.exe");
					driver = new ChromeDriver();
					break;
					
				case "EDGE":
					System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//servers//MicrosoftWebDriver.exe");
					driver = new EdgeDriver();
					break;
					
				default: System.out.println("Incorrect browser name");
					
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(URL);
		}
		//========================================================================	

		@AfterMethod
		public void closeBrowser() {		
			Reporter.closeTest();
			driver.close();
			System.out.println("<<TestSuccess>> TestCase Name   " + CurrentTestCaseName + "  <<TestSuccess>>");
			System.out.println();			
		}
		//========================================================================

		@AfterSuite
		public void flushReportAndOpen() {
			try {
				//Reports genreport = new Reports();
				Reporter.flushReport();
				
				Thread.sleep(2000);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Reporter.resultfile);
			driver.navigate().refresh();
		}		
		//========================================================================		
		
}