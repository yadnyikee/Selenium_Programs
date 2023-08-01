package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("(//a[@data-nav-role=\"signin\"])[1]"));
		act.moveToElement(ele).build().perform();
		
		WebElement ele1=driver.findElement(By.xpath("//span[contains(text(),'Recommendations')]"));
		
		ele1.click();
		
		
		
//		String URL = "https://www.facebook.com/";
//		
//		driver.get(URL);
//		
//		driver.findElement(By.id("email")).sendKeys("c12brtgr");
//		driver.findElement(By.id("pass")).sendKeys("1234567");
			
		driver.quit();
		
		
		
		
	}

}
