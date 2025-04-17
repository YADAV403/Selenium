package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MutlipleTabs {
	public static void main(String[] args) throws Exception {
		WebDriver wd = new FirefoxDriver();
		
		wd.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		String pwh = wd.getWindowHandle();
		System.out.println("ParentWindowHandle = " + pwh + wd.getTitle());
		wd.findElement(By.id("newTabBtn")).click();
		Set<String> wh =  wd.getWindowHandles();
		for(String h : wh) {
			if(!h.equals(pwh)) {
				wd.switchTo().window(h);
				wd.manage().window().maximize();
				wd.findElement(By.id("alertBox")).click();
				System.out.println(wd.switchTo().alert().getText());
				wd.switchTo().alert().accept();
				System.out.println( wd.findElement(By.id("output")).getText());
				Thread.sleep(3000);
				wd.close();
			}
		}
		wd.switchTo().window(pwh);
		wd.findElement(By.id("name")).sendKeys("yadav");
		Thread.sleep(3000);
		wd.quit();
	}
}
