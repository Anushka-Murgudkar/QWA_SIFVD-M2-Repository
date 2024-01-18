package com.Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://laptop/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//img[@class='sizer'])[3]")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("am");
		
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("amm");
		
		WebElement dropdown= driver.findElement(By.xpath("//select[@name='active']"));
		
		Select s = new Select(dropdown);
		s.selectByValue("false");
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("amm");
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("7066363194");
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("amm");
		
		driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("1032456987");
		
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("amm");
		
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("7066363194");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("amm@gmail.com");

		driver.findElement(By.xpath("//input[@name='otherContact']")).sendKeys("9960667171");
		
		WebElement dropdown1= driver.findElement(By.xpath("//select[@id='timeZoneName']"));
		
		Select s1 = new Select(dropdown1);
		s1.selectByValue("Pacific/Honolulu");


		driver.findElement(By.xpath("//input[@name='overtimeTracking']")).click();
		//workdayDurationStr
		driver.findElement(By.name("workdayDurationStr")).sendKeys("12:00");
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		driver.quit();

	}

}