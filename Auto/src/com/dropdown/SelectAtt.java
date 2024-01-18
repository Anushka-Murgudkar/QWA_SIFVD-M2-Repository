package com.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		
		 WebElement dd= driver.findElement(By.id("select-multiple-native"));
		 
		 Select s = new Select(dd);
		 
		 for(int i= 0; i<5; i++)
		 {
			 s.selectByIndex(i);
		 }
		 
		 for(int i= 0; i<5; i++)
		 {
			 s.deselectByIndex(i);
		 }

	}

}
