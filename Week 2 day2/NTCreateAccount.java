package com.java.basic.day4.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

	/*
	 * //Pseudo Code
	 * 
	 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
	 * 
	 * 2. Enter UserName and Password Using Id Locator
	 * 
	 * 3. Click on Login Button using Class Locator
	 * 
	 * 4. Click on CRM/SFA Link
	 * 
	 * 5. Click on Accounts Button
	 * 
	 * 6. Click on Create Account
	 * 
	 * 7. Select preferred currency as Indian Rupee using SelectByValue
	 * 
	 * 8. Enter the Description text as "NRI Account"
	 * 
	 * 9. Enter LocalName Field Using Xpath Locator
	 * 
	 * 10. Enter SiteName Field Using Xpath Locator
	 * 
	 * 11. Enter value for AnnualRevenue Field using Xpath Locator but class as
	  Attribute
	 * 

	 * 
	 * 17. Click on Create Account using Xpath Locator
	 * 
	 * 18. Get the Text of Error Message Displayed (hint: Red Texts)
	 * close the browser
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		//select preferred currency
		WebElement currency=	driver.findElement(By.id("currencyUomId"));
		Select cur = new Select(currency);
		cur.selectByValue("INR");
		//enter name, description, annual revenue
		driver.findElement(By.name("description")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Yuvaraj");
		driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("civil");
		driver.findElement(By.xpath("//input[@name='annualRevenue']")).sendKeys("100000");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).sendKeys(Keys.ENTER);
		//error message display
		String errorheader = driver.findElement(By.className("errorMessageHeader")).getText();
		System.out.println("error header"+errorheader);
		String errorList = driver.findElement(By.xpath("//ul/li[@class='errorMessage']")).getText();
		System.out.println("error list"+errorList);

		Thread.sleep(40);
		//browser close
		driver.close();
	}

}
