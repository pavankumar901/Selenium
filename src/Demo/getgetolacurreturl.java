package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getgetolacurreturl {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.olacabs.com/");
	String title=driver.getTitle();
	String url=driver.getCurrentUrl();
	System.out.println(title+"/n"+url);
	driver.close();
}
}
