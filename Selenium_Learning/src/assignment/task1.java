package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://polarbear.co.in/");
	Thread.sleep(2000);
	String titlOfwebpage = driver.getTitle();
	System.out.println( titlOfwebpage);
	driver.close();
	
	}
}

