package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tolunchRoyalenfield {
	@Test(groups = "regression")
	public void royalenfield() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.royalenfield.com/in/en/home/");
		Reporter.log("Royalenfield got exicuted.", true);
		driver.quit();
	}
}
