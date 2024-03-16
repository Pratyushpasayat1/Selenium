package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class toperformmovebyaction {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
	driver.findElement(By.id("password")).sendKeys("9854875");
	Actions action=new Actions(driver);
	action.moveByOffset(1295, 277).clickAndHold().perform();
	Thread.sleep(5000);
	driver.quit();
}
}
