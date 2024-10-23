package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement elections = driver.findElement(By.xpath("//span[text()='Electronics']"));

		Actions action=new Actions(driver);    // instance

		action.moveToElement(elections).click();
		action.perform();
		WebElement laptopdesktop = driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));

		action.moveToElement(laptopdesktop).click();//perform();

		driver.findElement(By.xpath("(//a[text()='Gaming Laptops'])[2]")).click();
		action.perform();

		if(driver.getTitle().contains("Gaming Laptops"))
			System.out.println("pass");
		else {
			System.out.println("fail");
			//        driver.quit();
		}
	}

}
