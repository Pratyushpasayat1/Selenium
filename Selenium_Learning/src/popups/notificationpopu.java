package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationpopu {
public static void main(String[] args) {
	
	ChromeOptions setting=new ChromeOptions();
	//setting.addArguments("--disable-notifications");
	setting.addArguments("--incognito");
	
	
	WebDriver driver=new ChromeDriver(setting);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.yatra.com/");
	driver.quit();
}
}
