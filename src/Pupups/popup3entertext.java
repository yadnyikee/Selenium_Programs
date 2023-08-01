package Pupups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup3entertext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
				
		   	driver.get("https://demo.automationtesting.in/Alerts.html");

		   	Thread.sleep(4000);
		   	
		   	driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		   	
		   	Thread.sleep(2000);
		   	
		   	driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
		   	
		   	Thread.sleep(2000);

		  	driver.switchTo().alert().sendKeys("swpamil");
		
		   	driver.switchTo().alert().accept();
		   	Thread.sleep(8000);
		   	driver.close();
		   	
	}

}
