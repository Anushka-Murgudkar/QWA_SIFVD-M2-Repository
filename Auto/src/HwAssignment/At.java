package HwAssignment;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class At {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub
			Random r=new Random();
			int no=r.nextInt(1000);
			WebDriver driver = new ChromeDriver();
			
			
			driver.manage().window().maximize();
			driver.get("http://laptop/login.do");
			
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			driver.findElement(By.xpath("//input[@value='Create New User']")).click();
			driver.findElement(By.name("username")).sendKeys("aakk"+ no);
				
					driver.findElement(By.name("passwordText")).sendKeys("aak");
							driver.findElement(By.name("passwordTextRetype")).sendKeys("aak");
							driver.findElement(By.name("firstName")).sendKeys("aak");
							
							driver.findElement(By.name("lastName")).sendKeys("k");
							Thread.sleep(2000);
							driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
							driver.findElement(By.xpath("//a[text()='k, aak (aakk)']")).click();
							driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
							
							TakesScreenshot ts= (TakesScreenshot) driver;
						File src= ts.getScreenshotAs(OutputType.FILE);
						 File dest= new File("./SS/imageff.png");
							Files.copy(src, dest);

						
							

	}

}
