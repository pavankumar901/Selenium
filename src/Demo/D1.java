package Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D1 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement allTB = driver.findElement(By.id("searchDropdownBox"));
		Select select=new Select(allTB);
         if(select.isMultiple())
         {
	      System.out.println("mutlip selest");
         }
         else
         {
        	 System.out.println("single select");
         }
         List<WebElement> options = select.getOptions();
         
         for (WebElement option: options) 
         {
        	 System.out.println(option.getText());
		 }
         select.selectByIndex(0);
         Thread.sleep(2000);
       select.deselectByValue("search-alias=amazon-devices");
        Thread.sleep(2000);
         select.deselectByVisibleText("Furniture");
         Thread.sleep(2000);
         driver.quit();
	
	
	
	}

}
