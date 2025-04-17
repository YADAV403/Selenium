package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebProperties {
	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://github.com/login");
		
//		System.out.println(wd.findElement(By.name("login")).getTagName());
		
//		System.out.println(wd.findElement(By.name("login")).getAttribute("name"));
		
//		WebElement WE =  wd.findElement(By.name("login"));
//		WE.sendKeys("prashanth@gmail.com");
//		System.out.println(WE.getAttribute("value"))

//		System.out.println(wd.findElement(By.name("commit")).getCssValue("color"));
		
		wd.quit();
	}

}
