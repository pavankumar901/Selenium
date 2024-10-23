package pom;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomcreate {

	
		@FindBy(id="email")
		private WebElement emailTF;
		
		@FindBy(id="password")
		private WebElement password;
		
		@FindBy(id="keepLoggedInCheckBox")
		private WebElement keepLoggedInCheckBox;
		 
		@FindBy(id="last")
		private WebElement lastBTN;
		
		// intialization
		
		public pomcreate(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}
		
		//utilization
		public void setEmail(String email) {
			emailTF.sendKeys(email);
			
		}
		public void setpassword(String pwd) {
			password.sendKeys(pwd);
		}
		public void clickkeepLoggedInCheckBox() {
			keepLoggedInCheckBox.click();
			
		}
	public void clicklast() {
		lastBTN.click();
	}

}
