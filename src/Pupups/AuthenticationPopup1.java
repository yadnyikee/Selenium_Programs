package Pupups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//in authentication popup we have to pass username and password to url 
	
//		driver.switchTo().alert().sendKeys("admin");
//		
//		driver.switchTo().alert().sendKeys("admin123");
//		
	//	driver.switchTo().alert().accept();
		
		String element=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).getText();
		
	    System.out.println(element);
	    
	    Thread.sleep(4000);
	    
	    driver.close();
		
	}

}
