package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import WebElementsMethods.GetText;

public class KeyBoardAction2 {
 public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
	 WebDriver driver=new ChromeDriver();
	 
   	driver.get("https://the-internet.herokuapp.com/key_presses");
	  
	   	driver.manage().window().maximize();

	   	Thread.sleep(3000);
	   	
	   	Actions act=new Actions(driver);
	   	
	   	act.sendKeys(Keys.BACK_SPACE).build().perform();
	   	
	   	System.out.println(driver.findElement(By.id("result")).getText());
	   	
	   	act.sendKeys("a").build().perform();
	   	
	   System.out.println(driver.findElement(By.id("result")).getText());
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	 
}
 
}
