package HwAssignment;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import graphql.language.Argument;

public class paztm {
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://paytm.com/");

	driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
	
	
	Thread.sleep(2000);
	driver.findElement(By.id("srcCode")).click();
	driver.findElement(By.xpath("//div[@class='_27rS9']")).click();
	driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
	
	driver.findElement(By.id("destCode")).click();
	driver.findElement(By.xpath("//div[@class='_27rS9']")).click();
	driver.findElement(By.xpath("//div[text()='Delhi, India']")).click();
	driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
	
	driver.findElement(By.xpath("//div[text()='18'][1]")).click();
	
	
	driver.findElement(By.id("travellerClass")).click();
	
	for(int i=0;i<2;i++)
	{
		driver.findElement(By.xpath("//img[@alt='add-icon'][1]")).click();
	}
	
	driver.findElement(By.id("flightSearch")).click();
	
	List<WebElement> allFlights = driver.findElements(By.xpath("//div[@class='M9kpV']"));
	
	for (WebElement flight : allFlights) {
		
		System.out.println(flight.getText());
		
	}
	
    TakesScreenshot ts= (TakesScreenshot) driver;
    
   File src=ts.getScreenshotAs(OutputType.FILE);
   File dest= new File("./SS/imagef.png");
	Files.copy(src, dest);

}
}
