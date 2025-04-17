package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumManager {
	public static void main(String[] args) throws Exception {
		WebDriver wd = new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.hyrtutorials.com/");
		System.out.println(wd.getTitle());
		Thread.sleep(3000);
		wd.quit();
		
	}

}
