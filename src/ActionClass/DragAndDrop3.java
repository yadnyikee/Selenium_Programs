package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		   	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		   	driver.manage().window().maximize();
		   	Thread.sleep(3000);
		   	
		Actions act=new Actions(driver);
		
		WebElement source=driver.findElement(By.id("box3"));
		WebElement dest=driver.findElement(By.id("box103"));
		
		act.dragAndDrop(source, dest).build().perform();
		
		Thread.sleep(3000);
		WebElement source1=driver.findElement(By.id("box1"));
		WebElement dest1=driver.findElement(By.id("box101"));
		
		act.dragAndDrop(source1, dest1).build().perform();
		
		Thread.sleep(3000);
		WebElement source2=driver.findElement(By.id("box5"));
		WebElement dest2=driver.findElement(By.id("box105"));
		
		act.dragAndDrop(source2, dest2).build().perform();
		Thread.sleep(3000);

		WebElement source3=driver.findElement(By.id("box7"));
		WebElement dest3=driver.findElement(By.id("box107"));
		
		act.dragAndDrop(source3, dest3).build().perform();
		   	
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
	}

}
