package Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
}
