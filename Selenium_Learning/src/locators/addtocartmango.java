package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtocartmango {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dunzo.com/bangalore");
	Thread.sleep(30000);
	driver.findElement(By.xpath("//a[@href='/search']")).click();
	Thread.sleep(20000);
	
}
}
