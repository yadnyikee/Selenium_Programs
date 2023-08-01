package CssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputtextAndAttribute {

	public static void main(String[] args) {
		
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//WebDriver driver=new ChromeDriver();

		
		driver.get("https://app.hubspot.com/login");
		
		


	}

}
