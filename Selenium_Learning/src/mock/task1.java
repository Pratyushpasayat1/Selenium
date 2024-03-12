package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.partialLinkText("Berlin 3 Seater Sofa (Velvet, Indigo Blue)")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();
		driver.quit();
}
}
