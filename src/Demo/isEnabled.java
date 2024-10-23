package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/?hl=en");
	
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  WebElement loginBT = driver.findElement(By.xpath("//button[@type='submit']"));
  if(loginBT.isEnabled()) {
	  System.out.println("Enabled");
	  loginBT.click();
  }else {
	  System.out.println("disenabled");
	  
	  
driver.findElement(By.name("username")).sendKeys("avbshdhdg");
driver.findElement(By.name("password")).sendKeys("12344");
if(loginBT.isEnabled()) {
	System.out.println("enabled");
	loginBT.click();
}
else
	System.out.println("disenable");
  driver.quit();
  }
  
}
}
