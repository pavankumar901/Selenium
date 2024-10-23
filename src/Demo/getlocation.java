package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement seleniumIED=driver.findElement(By.cssSelector("svg#selenium_ide"));
	Point loc=seleniumIED.getLocation();
	System.out.println("Location point:"+loc);
	System.out.println("x coordinate:"+loc.getX());
	System.out.println("y coordinate:"+loc.getY());
	
	Dimension size= seleniumIED.getSize();
	System.out.println("Dimension:"+size);
	System.out.println("Height:"+size.getHeight());
	System.out.println("Width:"+size.getHeight());
	
	driver.quit();
	
}
}
