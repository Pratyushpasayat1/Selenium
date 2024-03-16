package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class p5 {


public static  void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Apple iPhone 15 Pro Max (256 GB) - Black Titanium']")).click();
	
	
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./errorshorts/amazon.png");
	FileHandler.copy(temp, dest);
	driver.quit();
	
	
}
}