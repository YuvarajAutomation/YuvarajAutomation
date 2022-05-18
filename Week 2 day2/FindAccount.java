package com.java.basic.day4.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

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
	 * 6. Click on Find Accounts
	 * 
	 * 7. Enter AccountName as "Credit Limited Account" 
	 *  
	 * 8. Click on Find Accounts using xpath Locator
	 * 
	 * 9. Click on the edit Button
	 * 
	 * 10. Get the Text of Account Name and verify 
	 *  
	 * 11. Get the Text of Description
	 * 
	 * 12. Get the title of the page and verify it.
	 */

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//account URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		//find account
		driver.findElement(By.linkText("Find Accounts")).click();
		driver.findElement(By.id("ext-gen27")).sendKeys("Credit Limited Account");
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Credit Limited Account']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//Get the Text of Account Name and verify 
		String text =driver.findElement(By.xpath("//input[@id='accountName']")).getAttribute("value");
		String accountName= "Credit Limited Account";
		System.out.println("account name::"+text);

		if(text.equalsIgnoreCase(accountName)) {
			System.out.println("Verified Account name");
		}

		//Get the Text of Description
		String description =driver.findElement(By.name("description")).getText();

		System.out.println("description ::"+description);
		//	Get the title of the page and verify it.
		String title =driver.getTitle();
		System.out.println("title ::"+title);
		if(title.equalsIgnoreCase("Edit Account | opentaps CRM")) {
			System.out.println("verified title");
		}
	}

}
