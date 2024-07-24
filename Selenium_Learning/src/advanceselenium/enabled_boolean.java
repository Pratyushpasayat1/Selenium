package advanceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled_boolean {
	@Test(enabled = true)
	public void cricbuzz() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got tested.", true);
		driver.quit();
	}

	@Test(enabled = false)
	public void bascinrubben() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("bascinrobben tested succesfully.", true);
		driver.quit();
	}

	@Test(enabled = true)
	public void amazon() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon got tested.", true);
		driver.quit();
	}
}
