package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait2 {

	public static void main(String[] args) {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();		
	
	driver.get("https://www.ebay.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	Actions act=new Actions(driver);
	
WebElement ele=	driver.findElement(By.xpath("(//a[@_sp=\"p2481888.m1379.l3250\"])[1]"));
		
		act.moveToElement(ele).perform();
		
	driver.findElement(By.xpath("//a[contains(text(),'Samsung')]")).click();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
