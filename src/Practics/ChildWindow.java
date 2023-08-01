package Practics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
//		Set<String> id=driver.getWindowHandles();
//		
//		Iterator<String> it=id.iterator();
//		Thread.sleep(4000);
//		
//		String parent=it.next();
//		System.out.println("parent id---."+parent);
//		
//		Thread.sleep(4000);
//		String child=it.next();	
		
	    String parent=driver.getWindowHandle();
		
		String child=driver.getWindowHandle();
		
		System.out.println("parent id---."+parent);
		
		System.out.println("child id---."+child);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("swapnil");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("thakare");
		
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//img[@class=\"_8idr img\"]")).click();
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("name=\"email\"")).sendKeys("thakare75@gmail.com");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456");
		
		
		
		
		
		
		
		
	}

}
