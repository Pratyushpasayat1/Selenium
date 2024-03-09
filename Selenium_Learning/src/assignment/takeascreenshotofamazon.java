package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takeascreenshotofamazon {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
Thread.sleep(4000);
TakesScreenshot ts=(TakesScreenshot)driver;
File temp = ts.getScreenshotAs(OutputType.FILE);
File src = new File("./errorshorts/amazon.jpeg");
FileHandler.copy(temp, src);
Thread.sleep(2000);
driver.quit();
}
}
