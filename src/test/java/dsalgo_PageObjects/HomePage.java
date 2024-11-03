package dsalgo_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_DriverFactory.DriverFactory;

public class HomePage {

	// WebDriver driver;
	WebDriver driver = DriverFactory.getDriver();

	@FindBy(linkText = " Register ")
	WebElement registerLink;
	
	@FindBy(linkText="Sign in")
	WebElement signInLink;
	@FindBy(linkText = "Sign out")
	WebElement signOutLink;
	@FindBy(id = "id_username")
	WebElement loginUserName;
	@FindBy(id = "id_password")
	WebElement loginPwd;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginButton;
	@FindBy(xpath = "//div[contains(text(),'New Account Created.')]")
	WebElement newAccountMsg;

	public HomePage() {
		PageFactory.initElements(driver, this); // this indicates current class
	}
	public void enterUsername(String username) {
		loginUserName.sendKeys(username);
	}

	public void enterLoginPwd(String pwd) {
		loginPwd.sendKeys(pwd);
	}

	public String accountCreationMsg() {
		return newAccountMsg.getText();
		// System.out.println(newAccountMsg.getText());
	}

	public void clickOnRegisterLink() {
		registerLink.click();
	}

	public void clickOnSignInLink() {
		signInLink.click();
	}

	public void clickOnSignOutLink() {
		signOutLink.click();
	}

	public void clickOnLoginBtn() {
		loginButton.click();
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

}
