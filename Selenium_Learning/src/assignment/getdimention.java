package assignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdimention {
public static void main(String[] args) throws InterruptedException, MalformedURLException {
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to(new  URL("https://www.olivegarden.com/home"));
	Dimension sizeofbrowser = driver.manage().window().getSize();
	 System.out.println(sizeofbrowser);
	 Thread.sleep(2000);
	 driver.manage().window ().setSize( new Dimension(500,500));
	 driver.close();
}
}
