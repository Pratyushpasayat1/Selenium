package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderpopups {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.agoda.com/");
	driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
	driver.findElement(By.id("check-out-box")).click();
	for(;;) {
	try {
		driver.findElement(By.xpath("//div[text()='November 2024']/..//span[text()='2']")).click();
		break;
	}
		
	 catch (Exception e) {
		 driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
		
	}
	}
	Thread.sleep(5000);
	driver.quit();
	
	
}
}
