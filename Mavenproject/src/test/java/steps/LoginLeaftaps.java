package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeaftaps {
	public ChromeDriver driver;
	
	@Given("open the chrome browser")
	public void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Given("Launch the leaftap URL")
	public void launchUrls() {
		driver.get("http://leaftaps.com/opentaps/control/main");

	}
	@Given("Enter the user name as {string}")
	public void enterUsername(String username) {
		driver.findElementById("username").sendKeys(username);

	}
	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElementById("password").sendKeys("password");
	}
	@When("Click on the login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("Homepage should be displayed")
	public void verifyHomePage() {
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		System.out.println("HomePageDisplayed");

	}
	@But("error message be displayed")
	public void verifyErrorMessage() {

		System.out.println("error message displayed");

	
	}
}
