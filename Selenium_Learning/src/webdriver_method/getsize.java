package webdriver_method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize {


public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.zomato.com/bangalore");
driver.manage().window().maximize();
Thread.sleep(2000);


//to maximize
driver.manage().window().maximize();   //to maximize
Thread.sleep(10000);


//to minimize
driver.manage().window().minimize();
//to get fullscreen

driver.manage().window().fullscreen();   //no url seen and no other button seen.


//toget size

 Dimension sizeofbrowser = driver.manage().window().getSize();
 System.out.println(sizeofbrowser);
 Thread.sleep(2000);
 

 // to set size

 //Dimension d=new Dimension(500,500);    //method 1
// driver.manage().window ().setSize(d);
 
 driver.manage().window ().setSize( new Dimension(500,500));    //method 2
 


 //to getposition

 Point pos = driver.manage().window().getPosition();
 System.out.println(pos);
 
 //to setposition
 
 
 
 //driver.manage().window().setPosition(new Point(50,30));
 
 
 
 }
}
