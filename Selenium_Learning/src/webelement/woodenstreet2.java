package webelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class woodenstreet2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.woodenstreet.com/");
	
	List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='container flex']/li"));
	for(WebElement ele:elements) {
		System.out.println(ele.getText());
	}
	driver.quit();
}
}

