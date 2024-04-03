package validation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

public class facebooklogin {
	public static void main(String[] args) throws InterruptedException {
		String expectedusername = "pratyushpasayat@gmail.com";
		String expectedpassword = "pratyush@123";
		String expectedloginpagetitle = "Facebook – log in or sign up";

		// step-1open the browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser got lunched succesfully.");
		driver.manage().window().maximize();
		System.out.println("Browser got maximized successfully.");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// enter the url
		driver.get("https://www.facebook.com/");
		String actualloginpagetitle = driver.getTitle();
		if (actualloginpagetitle.equals(expectedloginpagetitle)) {
			System.out.println("Successfuly navigate to actual login page.");
		} else {
			System.out.println("Not navigate to facebook login page");
		}

		// step3-enter user name
		WebElement usernsmetextfield = driver.findElement(By.id("email"));
		usernsmetextfield.clear();
		usernsmetextfield.sendKeys(expectedusername);
		String actualusername = usernsmetextfield.getAttribute("value");
		if (actualusername.equals(expectedusername)) {
			System.out.println("user name textfield accepted data.");
		} else {
			System.out.println("User name text field not accepting data.");
		}

		// step=4 Enter the password
		WebElement passwordtextfield = driver.findElement(By.id("pass"));
		passwordtextfield.clear();
		passwordtextfield.sendKeys("pratyush@123");
		String actualpassword = passwordtextfield.getAttribute("value");
		if (actualpassword.equals(expectedpassword)) {
			System.out.println("Password text field accepts the data.");
		} else {
			System.out.println("Password text field not accepting the data.");
		}

		// to click login button
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		System.out.println("Home page is displaying.");

		// to close
		System.out.println("Driver closed succesfully.");
		driver.quit();
	}
}
