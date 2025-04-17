package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitTimeout {
	public static void main(String[] args) throws Exception {
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		
		wd.get("https://www.hyrtutorials.com/p/waits-demo.html");
		wd.findElement(By.id("btn1")).click();
		wd.findElement(By.id("txt1")).sendKeys("prashanth");
		Thread.sleep(3000);
		wd.quit();
		
	}

}
