package Pupups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
//		
//		
//		driver.manage().window().maximize();
//		
//		Thread.sleep(4000);
//		
//	WebElement ele=	driver.findElement(By.xpath("//button[@name=\"promptalertbox1234\"]"));
//		
//	
//	
//		ele.click();
//		
//		Thread.sleep(4000);
//		
//		
//		driver.switchTo().alert().sendKeys("Yes");
//		
//		
//		driver.switchTo().alert().accept();
//		
//		
//		driver.close();
		
		
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id=\"prompt\"]")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().sendKeys("123456");
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
