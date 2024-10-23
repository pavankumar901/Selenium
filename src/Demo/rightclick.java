package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchTB = driver.findElement(By.name("q"));
        Actions action=new Actions(driver);
        action.contextClick(searchTB).perform();
        Thread.sleep(3000);
        driver.quit();
	}

}