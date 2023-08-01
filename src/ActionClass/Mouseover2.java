package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
			
				
		   	driver.get("https://demo.automationtesting.in/Register.html");
		  
		   	driver.manage().window().maximize();

		   	Thread.sleep(3000);
		   	
		   	WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
		   	
		   	Actions action=new Actions(driver);
		   	
		   	action.moveToElement(ele).build().perform();
		   	Thread.sleep(3000);
		   	
		   	driver.close();
		   	
		   	
		   	
	}

}
