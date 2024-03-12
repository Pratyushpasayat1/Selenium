package mock;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tesk3 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.vtiger.com/");
		driver.findElement(By.partialLinkText("Resources")).click();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		driver.quit();
}
}