package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlediseble {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://www.facebook.com/");
		    
		WebElement loginBTN = driver.findElement(By.xpath("//button[@type='submit']`"));
		js.executeScript("arguments[0].removeAttribute('disabled','disabled)",loginBTN);
		
		loginBTN.click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
