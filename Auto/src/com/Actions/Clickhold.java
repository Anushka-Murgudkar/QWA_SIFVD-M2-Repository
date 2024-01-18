package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickhold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demoapps.qspiders.com/clickHold?scenario=1&sublist=0");
		
		WebElement circle=driver.findElement(By.id("circle"));
		Actions act=new Actions(driver);
		act.clickAndHold(circle).perform();
		Thread.sleep(2000);
		act.release().perform();
		driver.quit();

	}

}
