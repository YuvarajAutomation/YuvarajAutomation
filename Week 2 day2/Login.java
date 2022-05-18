package com.java.basic.day4.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	//	1. Load url "https://acme-test.uipath.com/login"
	//	2. Enter email as "kumar.testleaf@gmail.com"
	//	3. Enter Password as "leaf@12"
	//	4. Click login button
	//	5. Get the title of the page and print
	//	6. Click on Log Out
	//	7. Close the browser (use -driver.close())

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		WebElement user=	driver.findElement(By.id("email"));
		user.sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//title of the page

		String title =driver.findElement(By.tagName("a")).getText();
		System.out.println("title ::"+title);

		//log out
		driver.findElement(By.linkText("Log Out")).click();
		//close

		//driver.quit();
		driver.close();

	}

}
