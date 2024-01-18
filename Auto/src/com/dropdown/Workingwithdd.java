package com.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Workingwithdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("am");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("murgudkar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("anushkamurgudkar@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("anushkamurgudkar@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("anushkamurgudkar@gmail.com");
		
		WebElement dropdown = driver.findElement(By.id("day"));
		
		Select s = new Select(dropdown);
		s.selectByValue("7");
		
		WebElement d1 = driver.findElement(By.id("month"));
		Select s1 = new Select(d1);
		s1.selectByValue("2");
		
		WebElement d2 = driver.findElement(By.id("year"));
		Select s2 = new Select(d2);   //button[@id='u_9_s_Mi']
		s2.selectByValue("1997");
		
		driver.findElement(By.xpath("//input[@id='u_3_4_AD']")).click();
		driver.findElement(By.xpath("//input[@id='u_9_4_+M']")).click();
		driver.findElement(By.xpath("//button[@id='u_9_s_Mi']")).click();
		


	}

}
