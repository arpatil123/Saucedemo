package end_to_end_test;



	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import pageobject.checkout;
	import pageobject.filter;
	import pageobject.Loginpage;
	import pageobject.logout;
	import pageobject.productpage;
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Addtocart_checkout_filter_Logout {
		
		private WebDriver driver;
		private productpage productpage;
		private  Loginpage login;
		private pageobject.checkout checkout;
		private logout logout1;
		private filter filterpage;
		
		
		@Given("User is accessing saucedemo login page")
		public void user_is_accessing_saucedemo_login_page() {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.saucedemo.com/");
			login = new Loginpage(driver);
			productpage = new pageobject.productpage(driver);
			checkout = new pageobject.checkout(driver); 
			logout1 = new logout(driver);
			filterpage = new filter(driver);
		}

		@When("User enters valid username and password")
		public void user_enters_valid_username_and_password() {
			login.enterUsername("standard_user");
			login.enterpassword("secret_sauce");
			login.clickLogIn();
		}

		@Then("User should be able to navigate to Home Page")
		public void user_should_be_able_to_navigate_to_home_page() {
			login.isLogoDisplayed();
		}

		@And("click on breadcrumb icon")
		public void click_on_breadcrumb_icon() {
			productpage.clickmenuBtn();
		}

		@Then("User should be able to see the menu items")
		public void user_should_be_able_to_see_the_menu_items() {
			productpage.clickallItem();
			
			
		}
		

		@And("Clicks on add to button")
		public void clicks_on_add_to_button() {
			productpage.backPackImage();
//			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}

		@Then("Item should be added to the cart")
		public void item_should_be_added_to_the_cart() {
			productpage.cart();
		}
		@Then("Click on the cart container")
		public void click_on_the_cart_container() {
			checkout.clickOnCart();
			
		}

		@And("Click on checkout")
		public void click_on_checkout() {
			checkout.proceedToCheckout();
		}

		@Then("Enter the information")
		public void enter_the_information() {
			checkout.enterFirstname();
			checkout.enterLastname();
			checkout.enterpostalcode();
		}

		@And("Click on continue")
		public void click_on_continue() {
			checkout.continuetoCart();
		}

		@Then("Click on finish")
		public void click_on_finish() {
			checkout.orderCompleted();
		}

		@And("Click on product sort container")
		public void click_on_product_sort_container() {
			filterpage.selectFile();
			
		}

		@Then("Set a suitable option")
		public void set_a_suitable_option() {
			filterpage.selectText();
		}

		@And("Click on burger menu icon")
		public void click_on_burger_menu_icon() {
			logout1.clickOnBreadCrumbIcon();
		}

		@Then("Click on Log out")
		public void click_on_log_out() {
			logout1.logout();
		}
		@Then("Close the browser")
		public void close_the_browser() {
			driver.close();
		}



	}


