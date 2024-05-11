package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tofetchdata {
	public static void main(String[] args) throws IOException {

		// step-1:to create obj of fileinputstream
		FileInputStream fis = new FileInputStream("./testdata/testdata.properties");

		// step-2:create object of property file
		Properties prop = new Properties();

		// step-3:call methods
		prop.load(fis);

		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");

		// automation script
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);

	}
}
