package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws Exception {
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		
//		Alert Box
//		System.out.println(wd.findElement(By.id("output")).getText());
//		wd.findElement(By.id("alertBox")).click();
//		Thread.sleep(2000);
//		System.out.println(wd.switchTo().alert().getText());
//		wd.switchTo().alert().accept();
//		System.out.println(wd.findElement(By.id("output")).getText());
//		Thread.sleep(2000);
//		wd.quit();
		
//		Confirm Box
//		System.out.println(wd.findElement(By.id("output")).getText());
//		wd.findElement(By.id("confirmBox")).click();
//		Thread.sleep(2000);
//		System.out.println(wd.switchTo().alert().getText());
//		wd.switchTo().alert().accept();
//		System.out.println(wd.findElement(By.id("output")).getText());
//		wd.findElement(By.id("confirmBox")).click();
//		Thread.sleep(2000);
//		System.out.println(wd.switchTo().alert().getText());
//		wd.switchTo().alert().dismiss();
//		System.out.println(wd.findElement(By.id("output")).getText());
//		Thread.sleep(2000);
//		wd.quit();
		
//		Prompt Box
		System.out.println(wd.findElement(By.id("output")).getText());
		wd.findElement(By.id("promptBox")).click();
		Thread.sleep(2000);
		System.out.println(wd.switchTo().alert().getText());
		wd.switchTo().alert().sendKeys("Prashanth Yadav");
		wd.switchTo().alert().accept();
		System.out.println(wd.findElement(By.id("output")).getText());
		wd.findElement(By.id("promptBox")).click();
		Thread.sleep(2000);
		System.out.println(wd.switchTo().alert().getText());
		wd.switchTo().alert().dismiss();
		System.out.println(wd.findElement(By.id("output")).getText());
		Thread.sleep(2000);
		wd.quit();
		
		
		
		
		
		
		
		
		
	}

}
