package PageObject_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {//condtructor
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(xpath="//input[@placeholder=\"Username\"]")
    public WebElement usermail;
	
	@FindBy(xpath="//input[@placeholder=\"Password\"]")
	public WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement button;
	
	public void Usermail(String email) {
		usermail.sendKeys(email);
	}
	
	public void Password(String pass) {
		password.sendKeys(pass);
	}
	
	public void Login() {
		button.click();
	}
	
	public void URL() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	
	
	
	
    
    

}
