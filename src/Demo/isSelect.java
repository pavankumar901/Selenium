package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(null);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement login = driver.findElement(By.xpath("//a[text()='Create new account']"));
        WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
        if(female.isSelected()) {
        	System.out.println("Displayed");
        }else {
        	System.out.println("not Displayed");
        	female.click();
        }
        driver.quit();
	}
}
