package practiceqspiderapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.id("name")).sendKeys("Pratyush pasayat");
	driver.findElement(By.id("email")).sendKeys("pratyushpasayat1@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Password@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.linkText(" Login Now")).click();
	driver.findElement(By.id("email")).sendKeys("pratyushpasayat1@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Password@123");
	driver.findElement(By.xpath("//svg[@stroke='currentColor']")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
