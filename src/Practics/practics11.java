package Practics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practics11 {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		for(int i=1;i<=5;i++) {
			//Thread.sleep(1000);
			
		driver.findElement(By.xpath("//button[@onclick=\"addElement()\"]")).click();
		
		}
		for(int i=1;i<=4;i++) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class=\"added-manually\"]")).click();
			
			}
		
	
	
	}

}
