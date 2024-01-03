package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 	WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.zomato.com/india");
			
			String Url=driver.getCurrentUrl();
			
			if(Url.equals("https://www.zomato.com/india"))
			{
			System.out.println("pass");

	       	}
			else
			{
				System.out.println("fail");
			}
			
			String actual_title=driver.getTitle();
			
			if(actual_title.equals("Best Restaurants in India - Zomato"))
			{
			System.out.println("pass");

			}
			else{
				System.out.println("fail");
			}
			
			driver.close();
				
		}
	
	}