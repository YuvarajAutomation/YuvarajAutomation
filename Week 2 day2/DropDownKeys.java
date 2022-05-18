package com.java.basic.day4.selenium.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement element =driver.findElement(By.id("input-country"));
		Select list = new Select(element);
		//select by text
		list.selectByVisibleText("Algeria");
		//select by index
		list.selectByIndex(2);
		//options
		List<WebElement> country =list.getOptions();
		for(WebElement all : country) {
			System.out.println(all.getText());
		}
	}

}
