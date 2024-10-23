package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/?hl=en");
	Thread.sleep(0);
	
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("acbe");
	driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("ab@123");
	driver.findElement(By.xpath("")).click();

	Thread.sleep(0);
	driver.quit();
}
}
