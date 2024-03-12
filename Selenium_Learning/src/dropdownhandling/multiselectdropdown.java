package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectdropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demoapp.skillrary.com/");
	
	
	WebElement multiselections = driver.findElement(By.id("cars"));
	
	
	Select multiSelect=new Select(multiselections);
	System.out.println(multiSelect.isMultiple());
	
	multiSelect.selectByIndex(0);
	multiSelect.selectByValue("99");
	Thread.sleep(3000);
	
	multiSelect.deselectAll();
	driver.quit();
	
}
}
