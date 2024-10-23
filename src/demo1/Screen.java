package demo1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen 
{
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File par = new File("<Shots>.png");
		FileUtils.copyFile(temp, par);
		driver.quit();
	}

}
