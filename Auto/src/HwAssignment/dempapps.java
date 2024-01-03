package HwAssignment;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dempapps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int no=r.nextInt(1000);
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("6");
		
		driver.findElement(By.xpath("//input[@name='minLength']")).sendKeys("abcded");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcded");
		
		driver.findElement(By.xpath("//input[@name='maxLength']")).sendKeys("abcded");
		
		driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("abcded");
		driver.findElement(By.xpath("//input[@name='rangeLength']")).sendKeys("abcded");
		driver.findElement(By.xpath("//input[@name='minValue']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@name='maxValue']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@name='rangeValue']")).sendKeys("7");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcded@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='url']")).sendKeys("https://www.goggle.com");
		
		driver.findElement(By.xpath("//input[@name='digits']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@name='number']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//input[@name='alphanum']")).sendKeys("12345667df");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
