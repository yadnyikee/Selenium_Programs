package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
	/*	driver.get("https://www.orangehrm.com/");
		
		driver.manage().window().maximize();
		
		
		
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/section[1]/div[2]/div/div/div/div/div/form/fieldset/div[1]/div/input")).sendKeys("thakare7587@gmail.com");
		
		*/
	driver.get("https://login.yahoo.com/?.intl=in");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/form/div[1]/div[3]/input")).sendKeys("thakare7587@gmail.com");
		
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
