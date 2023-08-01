package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
			
		   	driver.get("https://demo.automationtesting.in/Static.html");
		 
		   	driver.manage().window().maximize();
		   	Thread.sleep(3000);
		   	
		   	Actions action=new Actions(driver);
		 
		   	WebElement source=driver.findElement(By.id("angular"));
		   	
		   	WebElement dest=driver.findElement(By.id("droparea"));
		   	
		   	action.dragAndDrop(source,dest).build().perform();
		   
		   	
	}

}
