package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	
		driver.get ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver. findElement (By.xpath("//a[contains(text (), 'OrangeHRM, Inc')]")).click();
		
		Thread.sleep(5000);
 
		 
		driver.quit();
		
	}

}
