package outline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class StepDefination {

	WebDriver driver = null;

	@Given("^user navigates to Facebook$")
	public void user_navigates_to_Facebook() {
        System.out.println("Inside Given method");
		System.setProperty("webdriver.ie.driver","E://IEDriverServer_x64_2.48.0//IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		System.out.println("After driver class initilization");
		driver.get("https://www.facebook.com/");
		System.out.println("After URL fetch");

	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
        System.out.println("Inside When");
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("pass")).sendKeys(arg2);
		driver.findElement(By.id("u_0_1")).click();

	}

	@Then("^login should be unsuccessful$")
	public void login_should_be_unsuccessful() {
		 System.out.println("Inside then");

		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}
		driver.close();
	}

}
