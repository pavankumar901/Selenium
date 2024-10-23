package demo1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtomethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver pavan=new ChromeDriver();
		pavan.get("https://www.google.com/intl/en_in/chrome/");
		
		Thread.sleep(2000);
		pavan.switchTo().newWindow(WindowType.TAB);
		pavan.get("https://www.instagram.com/?hl=en");
		  
		Thread.sleep(3000);
		
		
		pavan.switchTo().newWindow(WindowType.WINDOW);
		pavan.get("https://www.olx.in/");
		Thread.sleep(3000);
		
		
		String chiedtaddress=pavan.getWindowHandle();
		 Set<String> address = pavan.getWindowHandles();
		 System.out.println(chiedtaddress);
		 for(String String:address) {
			 System.out.println(String);
		 } 
		pavan.quit();
		 
	}

}
