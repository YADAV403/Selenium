package com.selenium;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout {
	public static void main(String[] args) throws Exception {
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		wd.manage().window().maximize();
		
		Instant start =  Instant.now();
		System.out.println("start time = " + start);
		wd.get("https://www.hyrtutorials.com/p/waits-demo.html");
		Instant stop =  Instant.now();
		System.out.println("stop time = " + stop);
		Duration duration =  Duration.between(start, stop);
		System.out.println("PageLoadTime = " + duration.getSeconds() + "seconds");
		System.out.println(wd.getTitle());
		Thread.sleep(3000);
		wd.quit();
	}

}
