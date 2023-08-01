package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
			
				
		   	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		  
		   	driver.manage().window().maximize();

		   	Thread.sleep(3000);
		   	
	    WebElement ele =driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
	
	   Actions act=new Actions(driver);
	
	  act.doubleClick(ele).build().perform();
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();

	Thread.sleep(3000);
	}

}
