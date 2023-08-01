package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();

//	driver.get("https://www.facebook.com/");

		
	//	driver.findElement(By.cssSelector("#email")).sendKeys("thakare7587@gmail.com");
		
		//driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
		
		//driver.get("https://www.orangehrm.com/");

	

	//	driver.findElement(By.cssSelector("#Form_submitForm_action_request")).click();
		
		
		
		
		
		driver.get("https://app.hubspot.com/login");
		
		
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("#username")).sendKeys("thakare7587@gmail.com");
		
		driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		
		
		driver.findElement(By.cssSelector("#loginBtn")).click();
		
		Thread.sleep(4000);
		
		
		driver.close();
	}

}
