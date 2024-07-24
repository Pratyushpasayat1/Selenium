package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tolunchRR310 {
	@Test(groups = "sanity")
	public void RR310() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bikewale.com/tvs-bikes/apache-rr-310/");
		Reporter.log("RR310 got exicuted.", true);
		driver.quit();
	}
}
