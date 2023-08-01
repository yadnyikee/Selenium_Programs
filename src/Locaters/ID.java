package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://academy.hubspot.com/");
		
	
		
		driver.manage().window().maximize();
		
		
	/*	driver.findElement(By.id("email")).sendKeys("swapnil");
		
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		
		
		driver.findElement(By.cssSelector("u_0_5_Ag")).click();*/
		
		
	/*	driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("thakare7587@gmail.com");
		
		driver.findElement(By.id("Form_submitForm_action_request")).click();*/
		
		
		driver.findElement(By.xpath("//a[text()='Sign up for free courses']")).click();
		
		
		Thread.sleep(8000);
		
		driver.close();
		
	
		
		
	}

}
