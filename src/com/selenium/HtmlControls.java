package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlControls {
	public static void main(String[] args) throws Exception {
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		wd.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		wd.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement we = wd.findElement(By.id("hindichbx"));
		we.click();
		Thread.sleep(3000);
		if(we.isSelected()) {
			we.click();
		}
		Thread.sleep(3000);
		wd.findElement(By.id("registerbtn")).click();
		System.out.println(wd.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		wd.findElement(By.linkText("Click here to navigate to the home page")).click();
	}

}
