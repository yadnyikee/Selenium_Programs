package Practics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_AlertPage {
	WebDriver driver;
	
	public Automation_AlertPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@href=\"Alerts.html\"]")
	WebElement alert;
	
	
	public void Switch() {
		alert.click();
	}
}
