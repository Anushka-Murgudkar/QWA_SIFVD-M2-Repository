package com.ts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		WebElement coin=driver.findElement(By.xpath("a[@title='Coins']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(coin).perform();
		driver.findElement(By.xpath("//span[text()='Coins By Design']"));
		

		RemoteWebDriver rwd= (RemoteWebDriver)driver;
		File src=rwd.getScreenshotAs(OutputType.FILE);
		File dest=new File("./SS/image4.png");
		Files.copy(src, dest);
		
	}

}