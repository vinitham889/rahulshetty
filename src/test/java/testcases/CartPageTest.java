package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import RahulsheetyAutomation.AutomationFramework.TestBase;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;

public class CartPageTest extends TestBase{
	HomePage homepage;
	CartPage cartpage;

	public CartPageTest() throws IOException {
		super();
	}
	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		initialization();
		LoginPage lp = new LoginPage();
		homepage  = lp.login(prop.getProperty("username"),prop.getProperty("password"));
		cartpage = new CartPage();
	}
	@Test
	public void placeorderTest() throws InterruptedException, IOException {
		homepage.addcart();
		cartpage.placeOrder();
	}

}
