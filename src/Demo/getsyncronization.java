
package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class getsyncronization {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//input[@class='_2FkHZ']")).sendKeys("biriyani");
		
		driver.findElement(By.xpath(null))
	}

}
