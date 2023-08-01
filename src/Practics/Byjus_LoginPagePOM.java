package Practics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Byjus_LoginPagePOM {
	WebDriver driver;
	
	public Byjus_LoginPagePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//a[class=\"primary-login-btn\"]")
	WebElement button;
	
	public void Login() {
		button.click();
	}
	
	public void URL() {
		driver.get("https://byjus.com/");
	}
	
	

}
