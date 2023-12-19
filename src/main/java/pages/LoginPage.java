package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RahulsheetyAutomation.AutomationFramework.TestBase;

public class LoginPage extends TestBase{

	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="userEmail")
	WebElement username;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement submitBtn;
	
	public HomePage login(String un,String pwd) throws IOException, InterruptedException {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		submitBtn.click();
		Thread.sleep(2000);
		return  new HomePage();
		
	}

}
