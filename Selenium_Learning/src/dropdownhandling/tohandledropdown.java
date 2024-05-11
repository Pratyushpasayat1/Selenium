package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tohandledropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/r.php?locale=en_GB");

		WebElement daydropdown = driver.findElement(By.id("day"));
		WebElement monthdropdown = driver.findElement(By.id("month"));
		WebElement yeardropdown = driver.findElement(By.id("year"));

		Select dayselect = new Select(daydropdown);
		Select monthselect = new Select(monthdropdown);
		Select yearselect = new Select(yeardropdown);

		dayselect.selectByIndex(9);
		monthselect.selectByIndex(6);
		yearselect.selectByVisibleText("2001");

		List<WebElement> allmonths = monthselect.getOptions();
		for (WebElement month : allmonths) {
			System.out.println(month.getText());

		}
	}
}
