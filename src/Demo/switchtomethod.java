package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class switchtomethod {



	public static void main(String[] args) throws InterruptedException {
		WebDriver pavan=new ChromeDriver();
		pavan.get("https://www.google.com/intl/en_in/chrome/");
		
		Thread.sleep(2000);
		pavan.switchTo().newWindow(WindowType.TAB);
		pavan.get("https://www.netflix.com/in/");
		
		pavan.close();
//		Thread.sleep(2000);
//		pavan.close();
		pavan.switchTo().newWindow(WindowType.WINDOW);
		pavan.get("https://in.bookmyshow.com/explore/home/hyderabad");
		
		Thread.sleep(2000);
		pavan.close();
		
		Thread.sleep(2000);
		pavan.quit();
	}

}
