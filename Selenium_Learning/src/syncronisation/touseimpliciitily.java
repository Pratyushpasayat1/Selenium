package syncronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class touseimpliciitily {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@class='username']")).sendKeys("pratyush");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12365252");
		
}
}
