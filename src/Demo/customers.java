package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class customers 
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDrvier();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebElement header=null;
		
	}
}
}
