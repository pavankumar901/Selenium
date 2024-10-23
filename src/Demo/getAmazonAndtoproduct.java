package Demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAmazonAndtoproduct {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tv 64+inch");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.linkText("LG 164 cm (65 inches) 4K Ultra HD Smart LED TV 65UR7500PSC (Dark Iron Gray)")).click();
		String parentID=driver.getWindowHandle();
		Set<String> windowID = driver.getWindowHandles();
		for (String str : windowID) {
			driver.switchTo().window(parentID);
			break;
		}
		
		String tvname=driver.findElement(By.id("productTitle")).getText();
		String ratingds=driver.findElement(By.);
		String prices=driver.findElement(null);	
		System.out.println(tvname+"/n"+ratingds+"/n"+prices);
		driver.close();
		driver.switchTo().window(parentID);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
