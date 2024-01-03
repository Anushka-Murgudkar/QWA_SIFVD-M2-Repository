package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

	 	WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		
		//to navigate the application
		driver.navigate().to("https://www.swiggy.com/");
		
		// to navigate the application back
		Thread.sleep(5000);
		driver.navigate().back();
		
		// to navigate the application forward
		Thread.sleep(5000);
		driver.navigate().forward();

		// to navigate the application refresh
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		driver.quit();
		

	}

}
