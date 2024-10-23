package Demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("goggles");
		driver.findElement(By.className("_2iLD__")).click();
		 
		driver.findElement(By.linkText("UV Protection Wayfarer Sunglasses (53)")).click();	
		String parentId=driver.getWindowHandle();
		 Set<String> windowID = driver.getWindowHandles();
		for (String str : windowID) {
			driver.switchTo().window(str);
			if(driver.getTitle().contains("Wayfarer Sunglasses"))
				break;
			
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		 Thread.sleep(2000);
		 driver.close();
		driver.switchTo().window(parentId);
		driver.navigate().refresh();
		 
		 WebElement cartaddnumbers = driver.findElement(By.className("ZuSA--"));
		 System.out.println(cartaddnumbers.getText());
		driver.quit();
	}

}
