package RealtiveXpathFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Startwith {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[starts-with(@id,\"Form_submitForm_EmailHomePage\")]")).sendKeys("dhkajsh@gmail.com");
	
		driver.findElement(By.xpath("//input[starts-with(@id,\"Form_submitForm_action_request\")]")).click();
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
