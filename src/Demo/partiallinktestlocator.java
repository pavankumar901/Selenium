package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallinktestlocator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/?hl=en");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Forgot password?")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Can't reset your password?")).click();
	Thread.sleep(20000);
	driver.quit();
}
}
