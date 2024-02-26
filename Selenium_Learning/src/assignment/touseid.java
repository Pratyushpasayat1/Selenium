package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class touseid {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("chiku");
		Thread.sleep(3000);
		driver.findElement(By.id("LastName")).sendKeys("pasayat");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("chiku@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Company")).sendKeys("Qspider");
		Thread.sleep(3000);
		driver.close();

	}
}
