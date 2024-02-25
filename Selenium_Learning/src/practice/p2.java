package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(new URL("https://www.barbequenation.com/"));
	Thread.sleep(2000);
	driver.navigate().to(new URL("https://www.youtube.com/"));
	Thread.sleep(2000);
	driver.navigate().to(new URL("https://online.kfc.co.in/"));
	driver.quit();
	
	}




}