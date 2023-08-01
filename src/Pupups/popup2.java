package Pupups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		   WebDriver driver=new ChromeDriver();
				
			driver.manage().window().maximize();
				
		   	driver.get("https://demo.automationtesting.in/Alerts.html");

		   	Thread.sleep(4000);
		   	
		   	driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		   	
		   	Thread.sleep(2000);
		   	
		   	
		   	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		   	
		   	Thread.sleep(2000);
		   	
		   	
		   	driver.switchTo().alert().dismiss();
		   	
		   	Thread.sleep(2000);
		   	
		   	driver.close();
		   	
	}

}
