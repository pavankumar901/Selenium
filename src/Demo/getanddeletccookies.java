package Demo;




import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.Cookie;

public class getanddeletccookies {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
     System.out.println("****** before delecting cookide**********");
     
     
		Set<Cookie>Cookies=driver.manage().getCookies();
		for(Cookie Cookie : Cookies)
		{
		}
		driver.manage().deleteAllCookies();
		System.out.println("***after delete cookies***");
		Cookies=driver.manage().getCookies();
		for(Cookie Cookie : Cookies)
		{
			System.out.println(Cookies.getName()+"/t"+Cookies.getExpiry());
			driver.quit();
}
}
}