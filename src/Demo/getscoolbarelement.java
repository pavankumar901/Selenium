package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getscoolbarelement {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement nocostEMI = driver.findElement(By.xpath("//span[contains(text(),'No cost EMI ')]"));
			 Point location=nocostEMI.getLocation();
	    int x=location.getX();
	    
	   int y=location.getY();
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(" +x+","+y+")");
	   
	   Thread.sleep(4000);
	   driver.quit();
	   
	 
}
}
