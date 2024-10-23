package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver()	;
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");

		WebElement emailTF=driver.findElement(By.id("email"));
		emailTF.sendKeys("abcv");

		WebElement passwordTF=driver.findElement(By.name("password"));
		passwordTF.sendKeys("fgtr123");
		WebElement checkBTN=driver.findElement(By.id("keepLoggedInCheckBox"));
		checkBTN.click();
		
		WebElement LoginBTN=driver.findElement(By.name("login"));
		LoginBTN.click();
		Thread.sleep(2000);
		driver.quit();
		}
		}

}
