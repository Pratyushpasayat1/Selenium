package validation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class properlyaligned {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.facebook.com/");
	int x1 = driver.findElement(By.id("email")).getLocation().getX();
	System.out.println(x1);
	int x2 = driver.findElement(By.id("pass")).getLocation().getX();
	System.out.println(x2);
	
	if(x1==x2) {
		System.out.println("properly alligned.");
	}
	else {
		System.out.println("not properly alligned.");
	}
	driver.quit();
}
}
