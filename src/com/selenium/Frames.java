package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
	public static void main(String[] args) throws Exception {
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.hyrtutorials.com/p/frames-practice.html");
		wd.findElement(By.id("name")).sendKeys("prashanth");
		Thread.sleep(3000);
		
		wd.switchTo().frame("frm1");
		Select course = new Select(wd.findElement(By.id("course")));
		course.selectByVisibleText("Java");
		Thread.sleep(3000);
		
		wd.switchTo().defaultContent();
		wd.findElement(By.id("name")).clear();
		wd.findElement(By.id("name")).sendKeys("yadav");
		Thread.sleep(3000);
		wd.quit();

		
	}

}
