package Practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byjus_Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.navigate().to("https://byjus.com/");
//		String id1=driver.getWindowHandle();
//		
//		System.out.println(id1);
		
		driver.findElement(By.xpath("//a[@class=\"primary-login-btn\"]")).click();
		
		Thread.sleep(4000);
		
//		String id=driver.getWindowHandle();
//		
//		System.out.println(id);
		
		Thread.sleep(4000);
		
	//	driver.switchTo().alert().sendKeys("8888119573");
		
//		driver.switchTo().window(id);
		String text1=driver.findElement(By.xpath("//p[@class=\"fw-bold text-dark enter-no-txt\"]")).getText();
		System.out.println(text1);
		
		
		driver.findElement(By.xpath("//input[@class=\"phone-text-input  form-control\"]")).sendKeys("8888119573");
		
		
		
		
		
		
		
		
		

	}

}
