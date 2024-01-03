package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		String actual_title=driver.getTitle();
		
		if(actual_title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
		System.out.println("pass");

	}
		else
		{
			System.out.println("fail");
		}
		
		driver.close();
			
	}

}
