package com.keyboardhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.contextClick().perform();
		
		Robot r = new Robot();
		
		for(int i =0; i<=8;i++) {
		
		r.keyPress(KeyEvent.VK_DOWN);
		}
				r.keyPress(KeyEvent.VK_ENTER);
		

	}
}