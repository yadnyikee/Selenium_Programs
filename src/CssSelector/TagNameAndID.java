package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameAndID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("input#username")).sendKeys("thakare7587@gmail.com");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("123456");
		
		
		driver.findElement(By.cssSelector("button#loginBtn")).click();
		
		
		
	/*	driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("thakare7587@gmail.com");
			
		driver.findElement(By.cssSelector("input#pass")).sendKeys("123456");
		
		driver.findElement(By.cssSelector("button#u_0_5_ey")).click();
		
		*/
		
		
		
		Thread.sleep(4000);
		
		
		driver.close();

	}

}
