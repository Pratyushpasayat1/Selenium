package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tousepromptpopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Alert promptpopup = driver.switchTo().alert();
	System.out.println(promptpopup.getText());
	promptpopup.sendKeys("chiku");
	promptpopup.accept();
	driver.quit();
	
	
}
}
