package advanceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tolearnTestng {

	@Test( invocationCount = 2,threadPoolSize = 2)
	public void cricbuzz() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got tested.", true);
		driver.quit();
	}

	@Test(invocationCount = 3,threadPoolSize = 3)
	public void bascinrubben() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("bascinrobben tested succesfully.", true);
		driver.quit();
	}

	@Test(invocationCount = 1,threadPoolSize =1 )
	public void amazon() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon got tested.", true);
		driver.quit();
	}
}
