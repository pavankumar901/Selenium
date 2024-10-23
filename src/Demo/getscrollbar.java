package Demo;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;


public class getscrollbar {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scollTo(0,1000)");
	
	Thread.sleep(2000);
	js.executeScript("window.scollTo(0,1000)");
	Thread.sleep(2000);
	driver.quit();
	}
}
