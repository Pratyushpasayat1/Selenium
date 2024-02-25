package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class captureurl {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String urlOfWebpage = driver.getCurrentUrl();
		System.out.println(urlOfWebpage);
		driver.close();
	}
}
