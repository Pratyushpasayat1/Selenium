package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tolunchHayabhusa {
	@Test(groups = "smoke")
	public void hayabhusa() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
		Reporter.log("Hayabhusa got exicuted.", true);
		driver.quit();
	}
}
