package Pupups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_JavaScript1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		//WebDriverManager.chromedriver ( ). setup ();
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
				
		   	driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		   	Thread.sleep(2000);
		   	
		  WebElement data =	driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
		   	
		  data.click();
		  
		   	driver.switchTo().alert().accept();
		   	
			Thread.sleep(4000);
		
//			WebElement element=driver.findElement(By.id("result"));
//			
//			System.out.println(element.getText());
			
//			String text=driver.findElement(By.id("result")).getText();
//			
//			System.out.println(text);
//			
//            Boolean Text=driver.findElement(By.id("result")).isDisplayed();
//			
//			System.out.println(Text);
			

		System.out.println(	driver.findElement(By.id("result")).isDisplayed());
			
			//System.out.println(element.isDisplayed());
			driver.close();
		   	
	}

}
