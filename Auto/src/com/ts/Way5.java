package com.ts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;


public class Way5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.netflix.com/in/");
		
		
		EventFiringWebDriver efw= new EventFiringWebDriver(driver);
		
		File src = efw.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./SS/nf.png");
		Files.copy(src, dest);
		

	}

}
