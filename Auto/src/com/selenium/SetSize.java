package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		WebDriver driver = new ChromeDriver();
		
		Dimension d= new Dimension(200, 400);
		
		driver.manage().window().setSize(d);
		
		Point p=new Point(200,400);
		driver.manage().window().setPosition(p);

	}

}
