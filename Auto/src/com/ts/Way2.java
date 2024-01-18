package com.ts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bluestone.com/jewellery/goldcoins.html");
		
		
		File src= driver.getScreenshotAs(OutputType.FILE);
		File dest= new File("./SS/image2.png");
		Files.copy(src, dest);

	}

}
