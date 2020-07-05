package com.dyt.ors.smoke;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91770\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://13.233.50.231:8080/ORS_SIT/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("loginId")).sendKeys("admin");
		driver.findElement(By.name("loginPwd")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();			
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='nav-link collapsed']")).click();
		
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		//Add a product
		
		//Verify a product in Products table
		boolean bTag = false; // assume product not displayed in table
		while(true) //check until product found in the table
		{
			//Search for newly added product
			
			//if product not found then click on Next link
				//In case we reach the end of entire table then exit ???????????
			
			//if Product found then  bTag = true and then exit from the while loop			
			
		}
		
		//verify bTag is true then pass else fail
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*		
		driver.findElement(By.xpath("//a[text()='Main Categories']")).click();
		
		driver.findElement(By.xpath("//a[@href='addMainCategories']")).click();		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='ors_mc_category_name']")).sendKeys("MyMainCategory");
		
		//driver.findElement(By.xpath("//select[@id='ors_order']/option[text()='A']")).click();
		
		WebElement assignOrder = driver.findElement(By.xpath("//select[@id='ors_order']"));
		Select sel_assignOrder = new Select(assignOrder);
		sel_assignOrder.selectByVisibleText("B");
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//input[@id='catgImage']"));		
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();		
		
		//driver.findElement(By.xpath("//input[@id='catgImage']")).click();
		
		Thread.sleep(3000);
		
		String filepath = "C:\\Users\\91770\\Desktop\\chemical.JPG";
		
		StringSelection file = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		
		Robot robot = new Robot();
		
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);			
		*/
		
		/*
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		
		Thread.sleep(3000);
		
		WebElement prev = driver.findElement(By.xpath("//ul[@class='pagination']/li[1]"));
		String className = prev.getAttribute("class");
		System.out.println(className);
		
		if(className.contains("disabled"))
			System.out.println("Disabled");
		else
			System.out.println("Enabled");			
		*/

	}

}
