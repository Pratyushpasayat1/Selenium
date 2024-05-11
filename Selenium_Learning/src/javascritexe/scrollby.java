package javascritexe;

import java.time.Duration;

import javax.swing.JComboBox.KeySelectionManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class scrollby {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("flower",Keys.ENTER);
	
	
	driver.findElement(By.xpath("//div[text()='Images']")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	for(;;)
	try {
		driver.findElement(By.xpath("//img[@alt='Buy Fresho Cut Roses Mixed Variants 1 ...']")).click();
		break;
	} catch (Exception e) {
		js.executeScript("window.scrollBy(0,500)");
	}
}
}

