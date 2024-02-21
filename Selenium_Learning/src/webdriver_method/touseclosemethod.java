package webdriver_method;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class touseclosemethod {
public static void main(String[] args) throws InterruptedException  {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://online.kfc.co.in/");
	Thread.sleep(2000);
	driver.close();
	}
}
