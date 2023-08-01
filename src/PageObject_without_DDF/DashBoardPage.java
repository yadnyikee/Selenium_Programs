package PageObject_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//p[@class=\"oxd-userdropdown-name\"]")
	WebElement name;
	
	@FindBy(xpath="//p[@class=\"oxd-text oxd-text--p orangehrm-attendance-card-details\"]")
	WebElement time;
	
	
	public void NameValidation() {
		if(name.equals("Puro Tumbado eaaaaa")) {
			System.out.println("correct login");
		}
		else
		{
			System.out.println("incorrect login");
		}
	}
	public void TimeCheck() {
		Boolean t=time.isDisplayed();
		System.out.println(t);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
