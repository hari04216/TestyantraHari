package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testbase {

	public WebDriver driver;

	@BeforeMethod
	public void launch() {
		 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

}
