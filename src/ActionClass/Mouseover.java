package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
			
				
		   	driver.get("https://www.amazon.com/");
		  
		   	driver.manage().window().maximize();

		   	Thread.sleep(3000);
		   	
		   	WebElement ele=driver.findElement(By.id("nav-link-accountList"));
		   	
		   	Actions action = new Actions(driver);
		   	
		  	action.moveToElement(ele).build().perform();
		  	
		 	driver.findElement(By.xpath("(//span[@class=\"nav-action-inner\"])[1]")).click();
			Thread.sleep(3000);
		   	
	}

}
