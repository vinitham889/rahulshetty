package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import RahulsheetyAutomation.AutomationFramework.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase{
	public static LoginPage loginpage;
	HomePage homepage;

	public LoginTest() throws IOException {
		super();
	}
	@BeforeClass
	public void setup() throws IOException {
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test
	public void loginpageTest() throws IOException, InterruptedException
	{
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
}
