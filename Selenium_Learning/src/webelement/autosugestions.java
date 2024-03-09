package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugestions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(3000);
		List<WebElement> suggestion = driver
				.findElements(By.xpath("//div[@class='two-pane-results-container']/div[1]/div"));
		for (WebElement ele : suggestion) {
			System.out.println(ele.getText());
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
