package com.java.basic.day7.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintValue {

	//	1. Launch the URL https://html.com/tags/table/
	//		2. You have to print the respective values based on given Library
	//		(hint: if the library was absolute usage, then print all its value)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");

		WebElement element =	driver.findElement(By.xpath("//div[@class='render']/table/thead/tr/th[1]"));
		System.out.println(element.getText());


		if(element.getText().contains("Library")) {

			List<WebElement> inner =  driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));

			for(WebElement totalrow : inner) {
				System.out.println(totalrow.getText());

			}
		}
	}
}

//}
