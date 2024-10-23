package Demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsizesetWindowSize {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Dimension dimension=driver.manage().window().getSize();
	System.out.println(dimension);
	dimension =new Dimension(1800,900);
	driver.manage().window().setSize(dimension);
	Thread.sleep(3000);
	driver.quit();
}
}
