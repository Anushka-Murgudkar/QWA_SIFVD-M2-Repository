package HwAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoweb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub LastName gender-male
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("anushkamurgudkar@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("anmhjj");
		driver.findElement(By.className("login-button")).click();

	}}
