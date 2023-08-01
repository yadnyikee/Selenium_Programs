package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
			
				
		   	driver.get("https://jqueryui.com/droppable/");
		   	
		   	
		   	driver.manage().window().maximize();

		   	Thread.sleep(3000);
		   	
		   	WebElement ele=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		   	
		   	driver.switchTo().frame(ele);
		   	
		   	WebElement source=driver.findElement(By.id("draggable"));
		   	
		   	WebElement dest=driver.findElement(By.id("droppable"));
		   	
		   	Actions action = new Actions(driver);
		   	
		   	action.dragAndDrop(source, dest).perform();
		   	
			Thread.sleep(3000);
			
			driver.close();
		   	
		   	
	}

}
