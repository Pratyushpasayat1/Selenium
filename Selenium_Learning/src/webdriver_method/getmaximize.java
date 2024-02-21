package webdriver_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class getmaximize {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.skillrary.com/");
	
	driver.manage().window().maximize();   //to maximize
	Thread.sleep(10000);
	
	driver.manage().window().minimize();    //to minimize
	
	driver.manage().window().fullscreen();   //no url seen and no other button seen.
	
}
}
