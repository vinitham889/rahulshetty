package RahulsheetyAutomation.AutomationFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
public static WebDriver driver;
public static Properties prop;
public TestBase() throws IOException {
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\AutomationFramework\\src\\main\\java\\config\\config.properties");
		prop.load(ip);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
}
public static void initialization() {
	String browserName = prop.getProperty("browser");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
}
}
