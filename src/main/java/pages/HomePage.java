package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import RahulsheetyAutomation.AutomationFramework.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	@FindBy(css ="#products > div.container > div.row > div:nth-child(1) > div > div > button.btn.w-10.rounded")
	WebElement addcart;
	
	@FindBy(xpath=" //*[contains(text(),'Product Added To Cart')]")
	WebElement toastMsg;
	
	public CartPage addcart() throws InterruptedException, IOException {
		addcart.click();
		String cnfMsg=toastMsg.getText();
		Assert.assertEquals(cnfMsg,"Product Added To Cart");
		return new CartPage();
	}

}
