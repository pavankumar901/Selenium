package Demo;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	WebElement io = driver.findElement(By.cssSelector("svg#selenium_webdriver"));
	 Rectangle rect = io.getRect();
	
	System.out.println("x coordinate:"+rect.getX());
	System.out.println("y coordinate:"+rect.getY());
	
	System.out.println("Height:"+rect.getHeight());
	System.out.println("Width:"+rect.getHeight());
	
	driver.quit();
	

   
}
}
