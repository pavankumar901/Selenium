package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getamazonpopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tv 65+inch");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.linkText("LG 164 cm (65 inches) 4K Ultra HD Smart LED TV 65UR7500PSC (Dark Iron Gray)")).click();
	}

}
