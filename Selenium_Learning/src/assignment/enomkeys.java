package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class enomkeys {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.instagram.com/");
	WebElement username = driver.findElement(By.xpath("//span[text()='Phone number, username, or email']"));
	username.sendKeys("pratyush pasayat");
	username.sendKeys(Keys.CONTROL+"c");
	
	WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
	password.sendKeys("password@123");
	password.sendKeys(Keys.CONTROL+"v");
}
}
