package ScreenShoot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class instagram {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement insta = driver.findElement(By.xpath("//div[@class='x9f619 x1n2onr6 x1ja2u2z']"));
        File temp = insta.getScreenshotAs(OutputType.FILE);
        File target=new File("./screenshots/insta.png");
        FileHandler.copy(temp, target);
        driver.quit();
	}

}
