package dsalgo_Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dsalgo_DriverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	WebDriver driver;

	@Before
	public void setup() {
		
		DriverFactory.initializeBrowser("chrome");
		driver = DriverFactory.getDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}

}
