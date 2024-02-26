package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class touse_id {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("chiku@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("1254858");
		Thread.sleep(2000);
		driver.close();
	}
}
