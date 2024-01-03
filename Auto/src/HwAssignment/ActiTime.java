package HwAssignment;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Random r=new Random();
		int no=r.nextInt(1000);
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("http://laptop/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//Thread.sleep(2000);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		//Projects & Customers
		driver.findElement(By.linkText("Projects & Customers")).click();
		//Create New Customer
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("anush" + no);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("am is best");
		driver.findElement(By.xpath("//input[@id='add_project_action']")).click();
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("aak");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("successfully executed");
		driver.findElement(By.xpath("//input[@value='add_new_tasks']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='task[0].name']")).sendKeys("done");
		driver.findElement(By.xpath("//img[@class='x-form-trigger x-form-date-trigger ']")).click();
		
		driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
	}}
