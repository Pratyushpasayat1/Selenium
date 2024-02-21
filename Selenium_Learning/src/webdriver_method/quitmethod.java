package webdriver_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class quitmethod {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.cornerhouseicecreams.com/");
	Thread.sleep(2000);
	//driver.quit();
	driver.close();
}
}
