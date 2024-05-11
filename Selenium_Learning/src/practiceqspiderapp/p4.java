package practiceqspiderapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://algoshack.com/");
	String actual = driver.findElement(By.linkText("algoQA")).getText();

	if(actual.equals("algoQA")) {
		System.out.println("test verified.");
	}
	else {
		System.out.println("test failed.");
	}
	driver.quit();
	
}
}
