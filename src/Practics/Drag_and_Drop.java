package Practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		Actions act=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
		Thread.sleep(4000);
		
		WebElement dest=driver.findElement(By.id("droppable"));
		
		Thread.sleep(4000);
		
		act.dragAndDrop(source,dest).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
