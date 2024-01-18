package HwAssignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(2000);

		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();

		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		// driver.findElement(By.xpath("//span[text()='Departure']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Fri Jan 19 2024']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Sat Jan 27 2024']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();

		driver.findElement(By.xpath("//span[text()='BOOK NOW']")).click();
		driver.findElement(By.xpath("//button[text()='BOOK NOW'][1]")).click();
	}
}
