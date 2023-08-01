package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.orangehrm.com/");
			
		//	driver.findElement(By.partialLinkText("Forgotten")).click();
			
			driver.findElement(By.partialLinkText("Plat")).click();
			
			Thread.sleep(4000);
			
			driver.close();
			
			
			
		}

	}


