package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tousepartiallinktext {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();    //to get count of urls.
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		driver.quit();
	}
}
