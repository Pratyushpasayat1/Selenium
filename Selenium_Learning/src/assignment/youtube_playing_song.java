package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class youtube_playing_song {
	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.youtube.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='search']")).sendKeys("denofo");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//a[@title='MC Miguel - Eu tô Fudendo (Videoclipe) +18 @GranfinoProd']")).click();
Thread.sleep(500000);
driver.quit();

	}
}
