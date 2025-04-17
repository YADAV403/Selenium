package com.selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.netty.handler.codec.base64.Base64;
import io.netty.handler.codec.base64.Base64Decoder;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.google.com/");
		
//		FILE
		File OF = ((TakesScreenshot)cd).getScreenshotAs(OutputType.FILE);
		File DF = new File("./Screenshot/img1.jpg");
		Files.copy(OF, DF);
		
//		BYTES
//		byte[] OF = cd.getScreenshotAs(OutputType.BYTES);
//		File DF = new File("./Screenshot/img1.jpg");
//		FileOutputStream fos = new FileOutputStream(DF);
//		fos.write(OF);
//		fos.close();
		
//		BASE64
//		String OF = cd.getScreenshotAs(OutputType.BASE64);
//		byte[] b = java.util.Base64.getDecoder().decode(OF);
//		File DF = new File("./Screenshot/img1.jpg");
//		FileOutputStream fos = new FileOutputStream(DF);
//		fos.write(b);
//		fos.close();
		System.out.println("Screenshot saved succesfully");
		cd.quit();
	}

}
