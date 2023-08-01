package Pupups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_JavaScript4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
				
		   	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		   	Thread.sleep(2000);
		   	
		   	driver.findElement(By.id("login1")).sendKeys("asdfghj");
		   	
		   	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		   	
//			Thread.sleep(2000);
//		   	
//		   	
//		   	driver.switchTo().alert().accept();
//		   	
//		   	
//		   	driver.findElement(By.id("password")).sendKeys("123456");
//		   	
//		   	
//			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//			
//			Thread.sleep(2000);
//			
//			driver.close();
//		   	
		   	String Expected_AlertMSG= "Please enter your password";
		   	Alert Ref_alert= driver.switchTo().alert();
		   	String Alert_MSG=Ref_alert.getText();

		   	if(Alert_MSG.equals(Expected_AlertMSG))
		   		System.out.println("Correct MSG");
		   	else
		   		System.out.println("Incorrect MSG");
		   	Thread.sleep(2000);

		   	Ref_alert.accept();
		   	Thread.sleep(2000);
		   	
		   	driver.close();
		   	
		   	
		   	
		   	
		   	
		   	
		   	
		   	
		   	
		   	
	}

}
