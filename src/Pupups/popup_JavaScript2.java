package Pupups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_JavaScript2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
				
		   	driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		   	Thread.sleep(2000);
		   	
		   	driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		   	
			Thread.sleep(5000);
		   	
		   	driver.switchTo().alert().dismiss();
		   	
			Thread.sleep(4000);
			
			
			
			WebElement element=driver.findElement(By.id("result"));
			
			System.out.println(element.getText());
			
			Boolean Text=driver.findElement(By.id("result")).isDisplayed();
			
			System.out.println(Text);
			
			driver.close();
		   	
	}

}
