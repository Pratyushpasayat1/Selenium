package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class playingsong_apdipodesong {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("apdipode");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[@title='Ghilli - Appadi Podu Song | Vijay | Trisha | Vidyasagar | KK | Anuradha Sriram | Pa. Vijay | Dharani']")).click();
	Thread.sleep(500000);
	driver.quit();

		}
}

