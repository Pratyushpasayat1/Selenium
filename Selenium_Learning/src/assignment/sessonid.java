package assignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class sessonid {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to(new  URL("https://www.barbequenation.com/"));
	String windowid = driver.getWindowHandle();        
	System.out.println(windowid);
	Thread.sleep(2000);
	String urlOfWebpage = driver.getCurrentUrl();
	System.out.println(urlOfWebpage);
	Dimension sizeofbrowser = driver.manage().window().getSize();
	 System.out.println(sizeofbrowser);
	 Thread.sleep(2000);
	 Point pos = driver.manage().window().getPosition();
	 System.out.println(pos);
	driver.quit();
}
}
