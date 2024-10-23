
package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindow {
public static void main(String[] args) {
WebDriver driver=	new ChromeDriver();
driver.get("https://www.instagram.com/?hl=en");
driver.close();
}
}
