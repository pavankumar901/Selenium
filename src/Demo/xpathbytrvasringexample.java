package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class xpathbytrvasringexample {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("goggles");
	driver.findElement(By.)
	
	Thread.sleep(2000);
	
	String product=driver.findElement(By.xpath(null))
	
     String price=driver.findElement(By.xpath("//a[text()='Gradient, UV Protection, Riding Glasses Retro Square Su...']/parent::div/child::a/child::div/child::div[1]")).getText();
	
	System.out.println(product);
}
}
