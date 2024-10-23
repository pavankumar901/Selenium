package Demo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{
	public static void main(String[] args) {
		WebDriver mv=new ChromeDriver();
		mv.get("https://www.flipkart.com/");
		System.out.println("---------------------");
		Set<Cookie>Cookies=mv.manage().getCookies();
		for(Cookie Cookie : Cookies)
		{
			System.out.println(Cookie.getName());
			System.out.println(Cookie.getExpiry());
		}
		mv.manage().deleteAllCookies();
		System.out.println("----------------------------");
		Cookies=mv.manage().getCookies();
		for(Cookie Cookie : Cookies)
		{
			System.out.println(Cookie.getName());
			System.out.println(Cookie.getExpiry());
		}
		mv.quit();
	}

}
