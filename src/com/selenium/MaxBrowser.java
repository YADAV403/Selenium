package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaxBrowser {
	public static void main(String[] args) {

		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("start-maximized");
		WebDriver wd = new ChromeDriver(CO);
		
		wd.get("https://www.google.com/");
	}

}
