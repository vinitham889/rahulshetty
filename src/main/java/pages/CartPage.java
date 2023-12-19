package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RahulsheetyAutomation.AutomationFramework.TestBase;

public class CartPage extends TestBase{

	public CartPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//app-sidebar/nav/ul/li[4]/button/i")
	WebElement cartBtn;
	
	@FindBy(css="body > app-root > app-profile > div > div.subtotal.cf.ng-star-inserted > ul > li:nth-child(3) > button")
	WebElement checkoutBtn;
	
	@FindBy(xpath="//div[@class=\"payment__shipping\"]//*[@class=\"input txt text-validated\"]")
	WebElement countrybtn;
	
	@FindBy(xpath="//*[contains(text(),'Place Order ')]")
	WebElement placeorderBtn;
	
	@FindBy(xpath=" //*[contains(text(),'Thankyou for the order.')]")
	WebElement cnfMsg;
	
	public void placeOrder() throws InterruptedException {
		cartBtn.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		checkoutBtn.click();
		countrybtn.sendKeys("India");
		countrybtn.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		countrybtn.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		countrybtn.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		placeorderBtn.click();
		
	}
	
	

}
