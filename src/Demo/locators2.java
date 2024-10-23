package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver()	;
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");

WebElement emailTF=driver.findElement(By.id("twotabsearchtextbox"));
emailTF.sendKeys("headphones");

WebElement loginBTN=driver.findElement(By.id("nav-search-submit-button"));
loginBTN.click();

Thread.sleep(2000);
driver.quit();
}
}
