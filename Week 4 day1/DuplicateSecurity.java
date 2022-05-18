package com.java.basic.day7.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateSecurity {

	//	1. Launch the URL https://www.chittorgarh.com/
	//		2. Click on stock market
	//		3. Click on NSE bulk Deals
	//		4. Get all the Security names
	//		5. Ensure whether there are duplicate Security names


	public static void main(String[] args) {
		WebElement elementTable;
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.chittorgarh.com/");

		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.navigate().to("https://www.chittorgarh.com/newportal/stock-nse-bulk-deals.asp");		
		//		WebElement tableElement =driver.findElement(By.xpath("//div[@class='table table-bordered table-condensed table-striped'"));
		elementTable = driver.findElement(By.xpath("//table"));
		elementTable=  elementTable.findElement(By.xpath("//thead"));
		elementTable =elementTable.findElement(By.xpath("//tr"));
		List<WebElement> head=  elementTable.findElements(By.xpath("//th"));

		for(int i=0;i<head.size();i++) {
			System.out.println("list::"+elementTable.getText());
		}
		System.out.println("element ::");
	}

}
