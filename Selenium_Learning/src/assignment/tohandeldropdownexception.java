package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tohandeldropdownexception {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.partialLinkText("Books")).click();
	
	WebElement productdropdown = driver.findElement(By.id("products-orderby"));
	Select productselect=new Select(productdropdown);
	productselect.selectByIndex(3);
	
	Thread.sleep(3000);
	driver.quit();
}
}
