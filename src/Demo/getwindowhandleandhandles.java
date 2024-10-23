package Demo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandleandhandles {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver pavan=new ChromeDriver();
			pavan.get("https://www.google.com/intl/en_in/chrome/");
			
			Thread.sleep(2000);
			pavan.switchTo().newWindow(WindowType.TAB);
			pavan.get("https://www.netflix.com/in/");
			
		
		Thread.sleep(2000);

			pavan.switchTo().newWindow(WindowType.WINDOW);
			pavan.get("https://in.bookmyshow.com/explore/home/hyderabad");
			
			
		
			String parentaddress=pavan.getWindowHandle();
			 Set<String> address = pavan.getWindowHandles();
			 
			 System.out.println("parentadderss:"+parentaddress);
			 System.out.println("********************");
			  
			 
			 for(String String:address) {
				 
			System.out.println(String);
			 }
		pavan.quit();

	

	}

}
