package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	public static void main(String[] args) throws Exception {
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement course = wd.findElement(By.id("course"));
		Thread.sleep(3000);
		Select s  = new Select(course);
		List<WebElement>options = s.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		Thread.sleep(3000);
		
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("java");
		Thread.sleep(3000);
		s.selectByVisibleText("Python");
		
		String sCourse = s.getFirstSelectedOption().getText();
		System.out.println("You have selected course: " + sCourse);
		
		
//		WebElement ide =  wd.findElement(By.id("ide"));
//		Thread.sleep(3000);
//		Select s  = new Select(ide);
//		List<WebElement>options = s.getOptions();
//		for (WebElement webElement : options) {
//			System.out.println(webElement.getText());
//		}
//		
//		Thread.sleep(3000);
//		s.selectByIndex(0);
//		Thread.sleep(3000);
//		s.selectByValue("ij");
//		Thread.sleep(3000);
//		s.selectByVisibleText("Visual Studio");
//		Thread.sleep(3000);
//		s.deselectByValue("ij");
//		
//		List<WebElement> sIDE = s.getAllSelectedOptions();
//		for (WebElement IDE : sIDE) {
//			System.out.println("Your selected IDE: " + IDE.getText());
		}		
		
	}


