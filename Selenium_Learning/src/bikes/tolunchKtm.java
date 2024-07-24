package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tolunchKtm {
	@Test(groups = "regression")
	public void ktm() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ktm.com/en-in.html");
		Reporter.log("Ktm got exicuted.", true);
		driver.quit();
	}
}
