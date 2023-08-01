package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveArrowUpandDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	Thread.sleep(4000);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("swapnil");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("thakareee");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("1234567896");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("thakare@gmail.com");
		
		Thread.sleep(4000);
		
	  WebElement month=driver.findElement(By.id("month"));
		
		Actions action=new Actions(driver);
		
		action.click(month).perform();
		
	    Thread.sleep(4000);
	    action.sendKeys(Keys.ARROW_UP).perform();
		
	   for(int i=1; i<=12; i++)
		{
			action.sendKeys(Keys.ARROW_UP).perform();
		}
	   for(int i=1; i<=12; i++)
		{
			action.sendKeys(Keys.ARROW_DOWN).perform();
		}
	   
		
	}

}
