package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssslector {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://github.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Sign in")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#email")).sendKeys("abc12345@gmail.come");
	 Thread.sleep(40000);
	 
	 driver.quit();
}
}
