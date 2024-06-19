package pageobject;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	public class filter {
		private WebDriver driver;
		private By filterLocator = By.xpath("//select[@class='product_sort_container']");
		
		public filter(WebDriver driver) {
			this.driver=driver;
		}
		
		public void selectFile() {
			WebElement filter_Se = driver.findElement(filterLocator);
			filter_Se.click();
		
			
			
		}
		
		public void selectText() {
			Select filter_Se = new Select(driver.findElement(filterLocator));
			filter_Se.selectByVisibleText("Name (Z to A)");
		}
		
		
		
		

	}


