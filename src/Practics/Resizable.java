package Practics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class Resizable {//not working

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/resizable");
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);

		
		WebElement element=driver.findElement(By.xpath("(//span[@class=\"react-resizable-handle react-resizable-handle-se\"])[1]"));
		
		Thread.sleep(3000);
		
		act.dragAndDropBy(element, 100,100).build().perform();
		
		
//  WebElement element1=driver.findElement(By.xpath("(//span[@class=\"react-resizable-handle react-resizable-handle-se\"])[2]"));
//		
//		Thread.sleep(3000);
//		
//		act.dragAndDropBy(element1, 100,100).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
