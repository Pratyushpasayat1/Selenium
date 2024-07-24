package advanceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class dataprovider {
@DataProvider(name="cred")
public String[][] toSendData() {
	String[][] sarr= {
			{"krishna@gmail.com","krishna@123"},
			{"rishav@gmail.com","rishav@123"},
			{"umesh@gmail.com","nepali@123"}};

	return sarr;
}
@Test(dataProvider="cred")
public void tologin(String un,String password) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(un);
	driver.findElement(By.id("pass")).sendKeys(password);
}
}
