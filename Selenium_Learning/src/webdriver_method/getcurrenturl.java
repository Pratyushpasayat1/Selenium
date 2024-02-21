package webdriver_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String urlOfWebpage = driver.getCurrentUrl();
	System.out.println(urlOfWebpage);
}
}
