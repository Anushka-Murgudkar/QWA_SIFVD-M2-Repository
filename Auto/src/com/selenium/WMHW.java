package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WMHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			
			String actual_title=driver.getTitle();
			
			if(actual_title.equals("Amazon.com. Spend less. Smile more."))
			{
			System.out.println("pass");

		}
			else
			{
				System.out.println("fail");
			}
	}

}
