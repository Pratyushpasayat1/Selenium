package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleelementrefenceexceptions {
public static void main(String[]args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	
driver.get("https://www.facebook.com/");
  WebElement usernametextfield = driver.findElement(By.id("email"));
  //refresh
  driver.navigate().refresh();
  usernametextfield .sendKeys("pratyush@gmail.com");
}
}
