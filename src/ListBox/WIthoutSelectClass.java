package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIthoutSelectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
	
		
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.manage().window().maximize();
		
		
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("macbook");
		
		

		Thread.sleep(8000);
		
		driver.close();

	}

}
