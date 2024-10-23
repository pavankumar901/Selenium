package Demo;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetandSetpositon {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Point point=driver.manage().window().getPosition();
	System.out.println(point);
	point=new Point(200,200);
	driver.manage().window().setPosition(point);
	Thread.sleep(10000);
	driver.quit();
}
}
