package assignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class forward {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to(new  URL("https://www.giallozafferano.com/"));
		Navigation nav = driver.navigate();
	    driver.get("https://www.skillrary.com/");
		Thread.sleep(3000);
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(3000);
		nav.refresh();	
		driver.quit();
		}
}
