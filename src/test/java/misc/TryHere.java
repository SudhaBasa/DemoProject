package misc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TryHere {

	WebDriver driver = new ChromeDriver();

	@Test
	public void justTry() {

		driver.get("https://dsportalapp.herokuapp.com/queue/implementation-collections/");

		System.out.println(driver.getTitle());

	}

	

}
