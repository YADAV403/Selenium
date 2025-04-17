package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

	public static void main(String[] args) throws Exception {
		WebDriver wd = new ChromeDriver();
		wd.get("https://github.com/login");
		WebElement pass = wd.findElement(By.id("login_field"));
		if(pass.isDisplayed()) {
			if(pass.isEnabled()) {
				pass.sendKeys("YADAV");
				String p = pass.getAttribute("value");
				System.err.println(p);
				Thread.sleep(5000);
				pass.sendKeys("403");
				Thread.sleep(5000);
				pass.clear();
			}
			else
				System.out.println("textbox is not enabled");
		}
		else
			System.err.println("textbox is not displayed");
	}

}
