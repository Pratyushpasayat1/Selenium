package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class usinglocators_in_demoshoppingapp {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("pratyush");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("pasayat");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("pratyushpasayat2@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
