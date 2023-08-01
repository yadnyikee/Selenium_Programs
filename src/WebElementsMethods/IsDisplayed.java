package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {//return type boolean

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
    	driver.get("https://www.facebook.com/");
    	Thread.sleep(4000);
    	
    	WebElement input=driver.findElement(By.id("email"));
    	
    	
    	System.out.println(input.isDisplayed());
		
    	
    	driver.close();
	}

}
