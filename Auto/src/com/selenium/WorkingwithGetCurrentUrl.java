package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class WorkingwithGetCurrentUrl {
	
	public static void main(String[] args) {
		
		 WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			
			String Url=driver.getCurrentUrl();
			
			if(Url.equals("https://www.amazon.com/"))
			{
			System.out.println("pass");

	       	}
			else
			{
				System.out.println("fail");
			}
			
			//to get source code
			String sc=driver.getPageSource();
			System.out.println(sc);
	}

}
