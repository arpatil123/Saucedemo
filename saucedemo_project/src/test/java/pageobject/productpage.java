package pageobject;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class productpage {
		
		private WebDriver driver;
		
		
		private By menuBtnLocator = By.xpath("//div[@class='bm-burger-button']");
		private By allItemLocator = By.id("inventory_sidebar_link");
		
		
		
		private By backPackLocator = By.xpath("//img[@alt='Sauce Labs Backpack']");
		private By addToCartLocator = By.id("add-to-cart");
		
		
		public productpage(WebDriver driver) {
			
			this.driver=driver;
		}
		 public void clickmenuBtn() {
			 WebElement breadCrumbIcon  = driver.findElement(menuBtnLocator);
			 breadCrumbIcon.click();
		 }
		 
		 public void clickallItem() {
			 WebElement allItem = driver.findElement(allItemLocator);
			 allItem.click();
		 }
		 
		 public String clickmenu_title() {
			 WebElement breadCrumbIcon  = driver.findElement(menuBtnLocator);
			 breadCrumbIcon.click();
			 return driver.getTitle();
			 
		 }
		 
		 public void backPackImage() {
			 WebElement backPack = driver.findElement(backPackLocator);
			 backPack.click();
		 }
		 
		 public void cart() {
			 WebElement addToCart = driver.findElement(addToCartLocator);
			 addToCart.click();
		 }
		 
		
		 
			
		
		
	}


