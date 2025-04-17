package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws Exception {
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.com/");
		Thread.sleep(5000);
		WebElement we = wd.findElement(By.id("APjFqb"));
		Thread.sleep(5000);
		we.sendKeys("hyr tutorials");
		Thread.sleep(5000);
		we.submit();
		Thread.sleep(5000);
		wd.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(5000);
		wd.findElement(By.name("username")).sendKeys("yadav@gmail.com");
		Thread.sleep(5000);
		wd.navigate().refresh();
		Thread.sleep(5000);
		wd.navigate().back();
		Thread.sleep(5000);
		wd.navigate().forward();
		Thread.sleep(5000);
		wd.quit();
		
		
		
		
		
		
		
		
		

	}

}
