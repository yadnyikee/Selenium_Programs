package Pupups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenpopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		   WebDriver driver=new ChromeDriver();
				
			driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		//To wait for 2sec
		Thread.sleep(2000);
		//To enter UN and PSW in login page
		
		driver.findElement(By.xpath("//span[@class=\"_1sLnDu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("abc");
		
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz123");

	}

}
