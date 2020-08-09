package newstuck_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login 
{
	public WebDriver driver;
	
	private By user = By.xpath("//input[@type='text']");
	private By Password = By.xpath("//input[@type='password']");
	private By Clicklogin = By.xpath("//input[@type='submit']"); 
	
	
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
}
	
	public WebElement getuser() {
		return driver.findElement(user);
	}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	public WebElement getClicklogin() {
		return driver.findElement(Clicklogin);
	}
}
