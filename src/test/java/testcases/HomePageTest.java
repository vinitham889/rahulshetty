package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import RahulsheetyAutomation.AutomationFramework.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends TestBase{
	HomePage homepage;

	public HomePageTest() throws IOException {
		super();
	}
	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		initialization();
		LoginPage lp = new LoginPage();
		homepage  = lp.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Test
	public void addCart() throws InterruptedException, IOException {
		homepage.addcart();
		
	}

}
