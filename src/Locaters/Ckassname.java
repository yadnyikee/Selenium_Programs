package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ckassname {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
   	driver.get("https://login.yahoo.com/?.intl=in");
		
    	 driver.findElement(By.className("phone-no")).sendKeys("7507870725");
        
    	driver.findElement(By.id("login-signin")).click();
		
		
		
    	 /*driver.get("https://www.orangehrm.com/");
		
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.className("email text tryit-email")).sendKeys("thakare7587@gmail.com");
		
		driver.findElement(By.className("action btn btn-ohrm btn-tryit-free")).click();
		*/
		
		
		
    	 
		Thread.sleep(4000);
		
		driver.close();
		

	}
}
