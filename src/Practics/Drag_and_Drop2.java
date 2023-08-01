package Practics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Thread.sleep(4000);
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.xpath("//a[@data-rb-event-key=\"accept\"]")).click();
		
	//	Thread.sleep(4000);
		
		WebElement drag=driver.findElement(By.id("acceptable"));
		
		WebElement drop=driver.findElement(By.xpath("(//div[@id=\"droppable\"])[2]"));
		
		
		act.dragAndDrop(drag,drop).build().perform();
		//Thread.sleep(3000);
		
		System.out.println(drop.getText());
		
		driver.close();
		
		
		
		
		
		
		
	}

}
