package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) throws Exception {
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		Actions ac = new Actions(wd);
//		wd.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5btdo4jz30_e&adgrpid=155259815433&hvpone=&hvptwo=&hvadid=676742245393&hvpos=&hvnetw=g&hvrand=14996673630872141780&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062123&hvtargid=kwd-105198719&hydadcr=5652_2408759&gad_source=1");
//		Thread.sleep(3000);
//		ac
//		.moveToElement(wd.findElement(By.id("nav-link-accountList-nav-line-1")))
//		.moveToElement(wd.findElement(By.className("nav-action-inner"))).click().perform();
//		wd.findElement(By.id("ap_email")).sendKeys("avulaparashanthyadav002@gmail.com");
//		ac
//		.moveToElement(wd.findElement(By.id("ap_email"))).doubleClick()
//		.perform();
		
		
		wd.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
		ac.contextClick(wd.findElement(By.xpath("//span[.='right click me']"))).perform();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//li[.='Edit']")).click();
		Thread.sleep(3000);
		wd.switchTo().alert();
		System.out.println(wd.switchTo().alert().getText());
		wd.switchTo().alert().accept();
		Thread.sleep(3000);
		

		
		
		
		
	}

}
