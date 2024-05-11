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

public class toreaddatafromexel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
//1= creaate obj of fis
	FileInputStream fis= new FileInputStream("./testData/Testdata selenium.xlsx");
	//2=create obj of respective path filetype
	Workbook wb= WorkbookFactory.create(fis);
	//3= call method
	String URL = wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	 String USERNAME = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
	 String PASSWORD = wb.getSheet("sheet1").getRow(2).getCell(0).toString();
	 //automaion script
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);
	 
}}
