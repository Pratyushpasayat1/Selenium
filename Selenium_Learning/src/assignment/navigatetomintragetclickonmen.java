package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatetomintragetclickonmen {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("desktop-main")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}