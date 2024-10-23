package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleargetTextGet {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://github.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement( By.xpath("//span[text()='Search or jump to...']")).click();
	 WebElement searchTf=driver.findElement(By.id("query-builder-test"));
	 searchTf.sendKeys("api repo"+Keys.ENTER);
	 
	 driver.findElement(By.xpath("//span[text()='Search or jump to...']")).click();
	 searchTf.clear();
	 searchTf.sendKeys(Keys.ENTER);
	 
	 WebElement advsearch =driver.findElement(By.linkText("advanced search"));
	 System.out.println(advsearch.getTagName());
	 System.out.println(advsearch.getText());
	 System.out.println(advsearch.getAttribute("href"));
	 driver.quit();
}
}