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

public class LoginScreenShot {
public static void main(String[] args) throws IOException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement loginTF = driver.findElement(By.xpath("//body[@style='background-color: rgb(255, 255, 255);']"));
     File temp = loginTF.getScreenshotAs(OutputType.FILE);
File target=new File("./screenshots/login.png");
FileHandler.copy(temp, target);
driver.quit();
}
}
