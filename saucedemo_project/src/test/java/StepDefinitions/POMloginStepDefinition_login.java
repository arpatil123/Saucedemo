package StepDefinitions;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;

import com.sun.tools.javac.util.Log;

   import pageobject.Loginpage;
	import pageobject.logout;
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class POMloginStepDefinition_login {
		private WebDriver driver;
		private Loginpage login;

		@Given("User is on login page")
		public void user_is_on_login_page() {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.saucedemo.com/");
			pageobject.Loginpage Log = new pageobject.Loginpage(driver);
			

			 
//			driver.manage().window().maximize();
			
		}
		
//		@When("User enters valid username and password")
		@When("User enters valid {string} and {string}")
		public void user_enters_valid_username_and_password(String username, String password) {
			
			login.enterUsername(username);
			login.enterpassword(password);

			
		}
		 
		@And("Clicks on Login Button")
		public void clicks_on_login_button() {
//			driver.findElement(By.id("login-button")).click();
			login.clickLogIn();
			
		}
		
		@Then("User is navigated to Home Page")
		public void  user_is_navigated_to_home_page() {
//			Assert.assertTrue(driver.findElements(By.xpath("//div[@class = 'app-logo']")).size()>0, "User is navigated to home page");
			login.isLogoDisplayed();
		}
		


		
		@And("close the browser")
		public void close_the_browser() {
			driver.close();
		}
	}


