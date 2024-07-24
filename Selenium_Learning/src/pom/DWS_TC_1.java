package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_TC_1 {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	
driver.get("https://demowebshop.tricentis.com/");
System.out.println("Navigate to demo web shop.");

Homepage hp=new Homepage(driver);
hp.getLoginlink().click();
System.out.println("navigate to login page.");
loginpage lp=new loginpage(driver);
lp.getEmailtextfield().sendKeys("pratyush@gmail.com");
lp.getPasswordtextfield().sendKeys("pratyush@123");

}
}
