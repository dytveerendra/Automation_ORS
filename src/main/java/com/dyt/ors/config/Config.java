package com.dyt.ors.config;

import org.openqa.selenium.WebDriver;

public class Config {
	
	public static WebDriver driver = null;
	public static final String URL = "http://www.orbitscience.com";
	public static String Browser = "chrome";
	public static String CurrentTestCaseName = "";
	public static String TestDataPath = System.getProperty("user.dir")+"//TestData";
	public static String ResultsPath = System.getProperty("user.dir")+"//Results";

}