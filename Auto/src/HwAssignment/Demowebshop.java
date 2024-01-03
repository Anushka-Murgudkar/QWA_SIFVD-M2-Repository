package HwAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub LastName gender-male
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//ul/li[4]/a[1])[1]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();

		driver.findElement(By.id("FirstName")).sendKeys("anushka");
		driver.findElement(By.id("LastName")).sendKeys("murgudkar");
		
		driver.findElement(By.id("Email")).sendKeys("anushkamurgudkar6@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("anmhjj");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("anmhjj");
		driver.findElement(By.id("register-button")).click();	
		driver.findElement(By.linkText("Log out")).click();
	}
}