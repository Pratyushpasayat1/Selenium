package practice;

import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;



public class p3 {
public static void main(String[] args) throws MalformedURLException {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to(new String("https://online.kfc.co.in/"));

Point p=new Point(50,20);
driver.manage().window().setPosition(p);
	Dimension d=new Dimension(50, 60);
	driver.manage().window().setSize(d);
	
}
}



