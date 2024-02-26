package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class touse_namelocator {
public static void main(String[] args) throws InterruptedException {
	
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/accounts/login/");
Thread.sleep(5000);
driver.findElement(By.name("username")).sendKeys("pratyush");
Thread.sleep(3000);
driver.findElement(By.name("password")).sendKeys("1236589");

}
}
