package dsalgo_StepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsalgo_DriverFactory.DriverFactory;
import dsalgo_PageObjects.HomePage;
import dsalgo_Utilities.ConfigReader;
import dsalgo_Utilities.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import utilities.Loggerload;

public class Home_SD {

	WebDriver driver = DriverFactory.getDriver();
	HomePage homePage = new HomePage();

	// @TS_Register_01
	@Given("The user opens DSAlgo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		// driver.get(ConfigReader.intializeProperties().getProperty("appURL"));
		//ConfigReader.getProperty("appURL");
		driver.get(ConfigReader.getProperty("appURL"));
	}

	@When("The user clicks the {string} Button")
	public void the_user_clicks_the_button(String string) {

		driver.findElement(By.xpath("//button[contains(text(),'Get Started')]")).click();
	}

	@Then("The User should be navigated to Home Page")
	public void the_user_should_be_navigated_to_home_page() {

		String title = driver.getTitle();
		// System.out.println(title);
		Assert.assertEquals(title, "NumpyNinja", "Title do not match");

	}

	// login on homepage
	@Given("The user is on Sign In Page of DS Algo Portal")
	public void the_user_is_on_login_page_of_ds_algo_portal() {
		Loggerload.info("The user is on Signin page of DS Algo portal");
		//ConfigReader.getProperty("appHomeURL");
		driver.get(ConfigReader.getProperty("appHomeURL"));
		homePage.clickOnSignInLink();
	}

	@When("The user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String username, String password) {
		Loggerload.info("Signing on the home page");
		homePage.enterUsername(username);
		homePage.enterLoginPwd(password);
		homePage.clickOnLoginBtn();
	}

	@When("The user is navigated to homepage")
	public void The_user_is_navigated_to_homepage() {
		Loggerload.info("The user is on Home Page");
		assertEquals("NumpyNinja", homePage.getPageTitle());

	}

}
