package webdriver_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class get_window_handle {
public static void main(String[] args) throws InterruptedException  {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	String windowid = driver.getWindowHandle();         // 62909EDF5F2B0F4A634E04B92EC70C58
	System.out.println(windowid);
	Thread.sleep(2000);
	driver.quit();
                                                        //B226B99B7F61044989859D5495DC0C42
}
}
