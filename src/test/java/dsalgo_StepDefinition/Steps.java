package stepsDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	WebDriver driver = new ChromeDriver();

	@Given("the user opens application")
	public void the_user_opens_application() {

		driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@When("the user should be able to click on Get Started Button")
	public void the_user_should_be_able_to_click_on_get_started_button() {
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();

	}

	@Then("the user should see Home page.")
	public void the_user_should_see_home_page() {

		boolean status = driver.findElement(By.xpath("//a[text()=' Register ']")).isDisplayed();
		Assert.assertEquals(status, true);
		System.out.println("We are on DSAlgo HomePage");
		
		driver.close();
	}

}
