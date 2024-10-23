package ScreenShoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class swiggy {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
WebElement swiggy = driver.findElement(By.id("root"));

     File temp = swiggy.getScreenshotAs(OutputType.FILE);
     File target= new File("./screenshots/swiggy.png");
     FileHandler.copy(temp, target);
     driver.quit();
	}

}
