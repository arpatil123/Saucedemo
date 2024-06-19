package pageobject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	private WebDriver driver;
	private By txt_username  = By.id("user-name");
	private By txt_password = By.id("password");
	private By btn_login = By.id("login-button");
	private By lbl_logo = By.id("menu_button_container");
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
		
	}	
	public void enterpassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
		
	}	
	public void clickLogIn() {
		driver.findElement(btn_login).click();
		
		
	}	
	public void isLogoDisplayed() {
		driver.findElement(lbl_logo).isDisplayed();
		
	}	
	
	public void userLogin(String username,String password )
	
	{
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();

	}
}



