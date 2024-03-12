package mock;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class task2 {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.zomato.com/");
	File temp = driver.findElement(By.xpath("//img[@src='https://b.zmtcdn.com/web_assets/8313a97515fcb0447d2d77c276532a511583262271.png']")).getScreenshotAs(OutputType.FILE);
	File src = new File("./errorshorts/zomatologo.jpeg");
	FileHandler.copy(temp, src);
	driver.quit();
}
}
