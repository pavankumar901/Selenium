package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGetTitlegGetCurrentUrl {
public static void main(String[] args) {
	WebDriver Driver=new ChromeDriver();
	Driver.get("https://www.flipkart.com/");
	String title= Driver.getTitle();
	String url=Driver.getCurrentUrl();
	System.out.println(title+"/n"+url);
	Driver.close();
}
}
