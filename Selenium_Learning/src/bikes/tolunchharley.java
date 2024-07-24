package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tolunchharley {
@Test(groups = "smoke")
public void harley() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.harley-davidson.com/in/en/index.html");
	Reporter.log("Harley got exicuted.", true);
	driver.quit();
}
}
