package StepsDefinations;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.LoginPage;

public class Steps {

	private WebDriver driver;
	public LoginPage lp;

	@Given("I open a web browser")
	public void i_open_a_web_browser() {
		// Initialize the ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		lp = new LoginPage(driver);
	}

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
	}

	@When("User open URL {string}")
	public void user_open_url(String URL) {
		driver.get(URL);
	}

	@When("User enter email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String Email, String Password) {
		lp.setUserName(Email);
		lp.setPassword(Password);
	}

	@When("Click on login")
	public void click_on_login() {
		lp.clickLogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be1(String title) {

	}

	@When("User click on Logout link")
	public void user_click_on_logout_link() throws InterruptedException {

		lp.clickLogout();
		Thread.sleep(1000);
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
	}

	@Then("close browser")
	public void close_browser() {
	}

}
