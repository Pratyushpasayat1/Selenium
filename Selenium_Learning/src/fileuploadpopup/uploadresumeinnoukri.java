package fileuploadpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadresumeinnoukri {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAjw7-SvBhB6EiwAwYdCAVo47w-zLnK8VYZuhSzXbXnPtut52dr-sp1Tcy_yBKo5DHwWi_B9_xoCmAQQAvD_BwE&gclsrc=aw.ds");
	Actions action=new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
	driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\praty\\OneDrive\\Desktop\\cv\\[Pratyush Sample Resume1.doc");
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
	
	
}
}
