package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	WebElement pa = driver.findElement(By.cssSelector("svg#selenium_ide"));
	Rectangle rect = pa.getRect();
	System.out.println("x coordinate:"+rect.getX());
	System.out.println("y coordinate:"+rect.getY());
	System.out.println("Hight:"+rect.getHeight());
	System.out.println("Width:"+rect.getWidth());
	driver.quit();
}
}
