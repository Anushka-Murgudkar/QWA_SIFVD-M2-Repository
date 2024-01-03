package HwAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		//String actual_title = driver.getTitle();
		//System.out.println(actual_title);
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("anushka.murgudkar22");
		
		driver.findElement(By.name("password")).sendKeys("ramajyfktfkuf");
		
		driver.findElement(By.className("_acap")).click();
		
		//driver.findElement(By.className(""))
		
		
		
		


		
		

	}
	

}
