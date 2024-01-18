package com.shopperstack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopperStack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.shoppersstack.com/");
			//Thread.sleep(2000);
			driver.findElement(By.id("loginBtn")).click();
			
			driver.findElement(By.id("Email")).sendKeys("anushkamurgudkar6@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Shivajipeth@151");
			driver.findElement(By.xpath("//span[text()='Login']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.id("search")).click();
			
			WebElement elec = driver.findElement(By.xpath("//a[@name='electronics']"));
		
			Actions act= new Actions(driver);
			act.moveToElement(elec).perform();
		
			driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
			//driver.findElement(By.id("searchBtn")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//button[text()='add to cart'][1]")).click();
			
			
	}

}
