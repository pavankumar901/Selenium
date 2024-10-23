package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonslider {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hand bages");
	 driver.findElement(By.id("nav-search-submit-button")).submit();
	 WebElement slider = driver.findElement(By.id("p_36/range-slider_slider-item"));
	 Actions action=new Actions(driver);
	 action.scrollToElement(slider).perform();
	 WebElement lower_bound_slider = driver.findElement(By.id("p_36/range-slider_slider-item_lower-bound-slider"));
	  WebElement upper_bound_slider = driver.findElement(By.id("p_36/range-slider_slider-item_upper-bound-slider"));
	 for
	 {
			if( lower_bound_slider.getAttribute("aria-valuetext").contains("100"))
         break;
			lower_bound_slider.sendKeys(Keys.ARROW_RIGHT);
	 }
	 if( upper_bound_slider.getAttribute("aria-valuetext").contains("20000"))
         break;
			upper_bound_slider.sendKeys(Keys.ARROW_RIGHT);
			
		driver.findElement(By.xpath("//input[contains(@aria-label,'Go')]")).click()	;
		Thread.sleep(2000);
		String first_item_price  driver.findElement(By.xpath(""))
}
}
