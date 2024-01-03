package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WWpartiallinktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			//driver.findElement(By.partialLinkText("Log in")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
			driver.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
			
			driver.quit();

	}

}
