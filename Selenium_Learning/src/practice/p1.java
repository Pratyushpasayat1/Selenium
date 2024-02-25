package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.barbequenation.com/");
	Thread.sleep(2000);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	String sourcecoad = driver.getPageSource();
	System.out.println(sourcecoad);
	driver.quit();	
	}
}
