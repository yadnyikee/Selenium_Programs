package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
	//	driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getSize());
		

		 driver.close();
	}

}
