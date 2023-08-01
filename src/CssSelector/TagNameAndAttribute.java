package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameAndAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		
		driver.findElement (By.cssSelector("[name=email]")).sendKeys ("123") ;
		
		
		driver.findElement(By.cssSelector("[name=pass]")).sendKeys("1234");
		
		
	//	driver.findElement(By.xpath("input[class=\"email text tryit-email\"]")).sendKeys("dsahfalksjdf@");
		
		//driver.findElement(By.xpath("input[name=\"pass\"]")).sendKeys("123456");
		
		//driver.findElement(By.xpath("button[name=\"login\"]")).click();
		
		

		Thread.sleep(4000);
		
		
		driver.close();

	}

}
