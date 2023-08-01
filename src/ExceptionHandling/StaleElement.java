package ExceptionHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {

	public static void main(String[] args) {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		WebElement element=driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[4]"));
		
		element.click();
		
	    driver.navigate().back();
		
	    
	    try {
	          element.click();
	
	    }
	    catch (Exception e) {
	    	WebElement element1=driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[4]"));
	    	element1.click();
	    	
		}
		
		
		
		
		
		
		
		
		
		
		
	   

	}

}
