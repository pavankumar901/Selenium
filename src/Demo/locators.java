package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver()	;
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

WebElement emailTF=driver.findElement(By.id("email"));
emailTF.sendKeys("abacfh");

WebElement passwordTF=driver.findElement(By.name("pass"));
passwordTF.sendKeys("asdfg");

WebElement loginTF=driver.findElement(By.name("login"));
loginTF.click();

Thread.sleep(3000);
driver.quit();
}
}
