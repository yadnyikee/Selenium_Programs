package Pupups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popup1 {
@Test
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		   WebDriver driver=new ChromeDriver();
				
			driver.manage().window().maximize();
				
		   	driver.get("https://demo.automationtesting.in/Alerts.html");

		   	Thread.sleep(4000);
		   	
		   	driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		   	
		   	driver.switchTo().alert().accept();
		   	
		 	Thread.sleep(4000);
		   	
		   	driver.close();
		   	
		   	

	}
public void test2()
{
	System.out.println("fjjjjj");
}
}
