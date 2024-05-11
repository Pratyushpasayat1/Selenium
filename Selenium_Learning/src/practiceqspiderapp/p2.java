package practiceqspiderapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class p2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15) );
	driver.get("https://www.jiocinema.com/");
	driver.findElement(By.id("7cc994be_1711234817815")).click();
	driver.findElement(By.xpath("//img[@class='rightNavButton']")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
