package Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refreshtheamazon {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.location=arguments[0]","https://www.amazon.in/amazonprime");
		 System.err.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.title")); 
        
		Thread.sleep(2000);
		js.executeScript("history.go[0]");
		Thread.sleep(2000);
		driver.quit();
		
	
	
	}

}
