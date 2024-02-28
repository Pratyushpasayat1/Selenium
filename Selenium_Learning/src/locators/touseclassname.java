package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class touseclassname {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.className("email")).sendKeys("1245875");
	Thread.sleep(3000);
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/accounts/login/");
	driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("548755");
	driver.quit();
}
}
