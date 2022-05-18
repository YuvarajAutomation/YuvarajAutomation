package com.java.basic.day7.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountTable {

	//	1. Launch the URL https://html.com/tags/table/
	//		2. Get the count of number of rows
	//		3. Get the count of number of columns

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		//count number of rows
		List<WebElement> rows =	driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
		System.out.println(rows.size());
		//count number of columns
		List<WebElement> columns =	driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr/td"));
		System.out.println(columns.size());
		//count second rows
		List<WebElement> secondrows=	driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr"));
		System.out.println(secondrows.size());
		//count second column
		List<WebElement> secondcolumns=	driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr[2]/td"));
		System.out.println(secondcolumns.size());

	}

}
