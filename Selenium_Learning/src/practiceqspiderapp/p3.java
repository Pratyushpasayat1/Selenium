package practiceqspiderapp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class p3 {
public static void main(String[] args) throws IOException, InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.flipkart.com/");
	File temp = driver.findElement(By.xpath("//img[@src='https://static-assets-web.flixcart.com/batman-returns/batman-returns/p/images/fkheaderlogo_exploreplus-44005d.svg']")).getScreenshotAs(OutputType.FILE);
	File src = new File("./errorshorts/flipkart.jpeg");
	FileHandler.copy(temp, src);
	Thread.sleep(2000);
	driver.quit();
}
}
