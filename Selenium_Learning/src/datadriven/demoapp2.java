package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoapp2 {
public static void main(String[] args) throws IOException, InterruptedException {
	FileInputStream fis = new FileInputStream("./testdata/demowebshop.properties");
	
	Properties prop = new Properties();

	prop.load(fis);

	String URL = prop.getProperty("url");
	String FIRSTNAME = prop.getProperty("firstname");
	String LASTNAME = prop.getProperty("lastname");
	String MAIL = prop.getProperty("mail");
	String PASS = prop.getProperty("pass");
	String CONPASS = prop.getProperty("conpass");
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


	driver.get(URL);
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys(FIRSTNAME);
	driver.findElement(By.id("LastName")).sendKeys(LASTNAME);
	driver.findElement(By.id("Email")).sendKeys(MAIL);
	driver.findElement(By.id("Password")).sendKeys(PASS);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(CONPASS);
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(3000);
	driver.quit();
	

}
}
