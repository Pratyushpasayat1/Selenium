package webdriver_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class togettittle {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	String titlOfwebpage = driver.getTitle();
	
	
	System.out.println( titlOfwebpage);
	driver.close();
	
	}
}
