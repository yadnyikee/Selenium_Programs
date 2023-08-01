package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
    	driver.get("https://www.facebook.com/");
		
      
       driver.findElement(By.tagName("input")).sendKeys("12345");
		
		
	
		
		//driver.findElement(By.tagName("placeholder")).sendKeys("swapni");
		
		driver.findElement(By.tagName("button")).click();
		
		/*driver.get("https://www.orangehrm.com/");
		
		driver.manage().window().fullscreen();
		
		
		driver.findElement(By.tagName("input")).sendKeys("thakare7587@gmail.com");
		
		
		driver.findElement(By.tagName("input")).click();
		*/
		Thread.sleep(4000);
		
		driver.close();
		

	}

}
