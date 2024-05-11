package javascritexe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollintoview {
public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement indianflag = driver.findElement(By.xpath("//div[text()='India']"));
		js.executeScript("arguments(0).ScrollIntoView(false)",indianflag);
}
}
