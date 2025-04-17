package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitTimeout {
	public static void main(String[] args) throws Exception {
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.testim.io/test-automation-tool/");
		String pwh = wd.getWindowHandle();
		wd.findElement(By.linkText("Login")).click();
		Set<String> whs =  wd.getWindowHandles();
		for(String wh : whs) {
			if (!wh.equals(pwh)) {
				wd.switchTo().window(wh);
				wd.findElement(By.id("username")).sendKeys("prashanth");
			}
		}

	}

}
