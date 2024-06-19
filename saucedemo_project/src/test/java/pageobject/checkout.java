package pageobject;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class checkout {
		
		private WebDriver driver;
		private By cartContainer = By.id("shopping_cart_container");
		private By checkoutLocator = By.id("checkout");
		private By firstnameLocator = By.id("first-name");
		private By lastnameLocator = By.id ("last-name");
		private By postalcodeLocator = By.id ("postal-code");
		private By proceedLocator = By.id ("continue");
		private By order_completed = By.id ("finish");
		
		public checkout(WebDriver driver) {
			this.driver = driver;
		}
		
		public void clickOnCart() {
			WebElement cartIcon = driver.findElement(cartContainer);
			cartIcon.click();
		}
		
		public void proceedToCheckout() {
			WebElement checkOut = driver.findElement(checkoutLocator);
			checkOut.click();
		}
		public void enterFirstname() {
			WebElement firstName = driver.findElement(firstnameLocator);
			firstName.sendKeys("Shiksha");
		}
		
		public void enterLastname() {
			WebElement lastName = driver.findElement(lastnameLocator);
			lastName.sendKeys("Tiwari");
			}
		
		public void enterpostalcode() {
			WebElement postalCode = driver.findElement(postalcodeLocator);
			postalCode.sendKeys("112346");
		}
		 
		public void continuetoCart() {
			WebElement cartcontinue = driver.findElement(proceedLocator);
			cartcontinue.click();
			
		}
		 public void orderCompleted() {
			 WebElement completedorder = driver.findElement(order_completed);
			 completedorder.click();
			 
		 }





	}


