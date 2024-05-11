package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoapp {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./testData/Book3.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		String URL = wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		String FIRSTNAME = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		String LASTNAME = wb.getSheet("sheet1").getRow(2).getCell(0).getStringCellValue();
		String GMAIL = wb.getSheet("sheet1").getRow(3).getCell(0).getStringCellValue();
		String PASS = wb.getSheet("sheet1").getRow(4).getCell(0).getStringCellValue();
		String CONPASS = wb.getSheet("sheet1").getRow(5).getCell(0).getStringCellValue();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get(URL);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FIRSTNAME);
		driver.findElement(By.id("LastName")).sendKeys(LASTNAME);
		driver.findElement(By.id("Email")).sendKeys(GMAIL);
		driver.findElement(By.id("Password")).sendKeys(PASS);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(CONPASS);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.quit();

	}
}
