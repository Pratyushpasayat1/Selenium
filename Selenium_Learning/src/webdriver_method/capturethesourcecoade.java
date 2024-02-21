package webdriver_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class capturethesourcecoade {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	String sourceCode = driver.getPageSource();
	System.out.println(sourceCode);
}
}
