package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class usexpathbycontains {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Register']")).click();
		Thread.sleep(3000);
		String errormassage1 = driver.findElement(By.xpath("//span[contains(text(),'First')]")).getText();
		System.out.println(errormassage1);
		Thread.sleep(3000);
		String errormassage2 = driver.findElement(By.xpath("//span[contains(text(),'Last')]")).getText();
		System.out.println(errormassage2);
		Thread.sleep(3000);
		String errormassage3 = driver.findElement(By.xpath("//span[contains(text(),'Email')]")).getText();
		System.out.println(errormassage3);
		Thread.sleep(3000);
		String errormassage4 = driver.findElement(By.xpath("//span[contains(text(),'Password')]")).getText();
		System.out.println(errormassage4);
		Thread.sleep(3000);
		String errormassage5 = driver.findElement(By.xpath("//span[contains(text(),'required')]")).getText();
		System.out.println(errormassage5);
		Thread.sleep(3000);
		driver.quit();
	}
}