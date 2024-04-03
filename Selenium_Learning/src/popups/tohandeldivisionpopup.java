package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tohandeldivisionpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");

		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//a[@class='close']")).click();
		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("//label[@for='departure']")).click();

		for (;;) {
			try {
				driver.findElement(By.xpath("//div[text()='September 2024']/../..//p[text()='4']")).click();
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			break;
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
