package Practics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow2orangehrm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.navigate().to("https://www.orangehrm.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("((//a[@href=\"/en/company/about-us/\"])[3]")).click();
		
//		
//		Set<String> id=driver.getWindowHandles();
//		
//		Iterator<String> it=id.iterator();
//	
//		
//		String parent=it.next();
//		
//		String child=it.next();	
		
	    String parent=driver.getWindowHandle();
		
		String child=driver.getWindowHandle();
		
		System.out.println("parent id---."+parent);
		
		System.out.println("child id---."+child);
		
		Thread.sleep(2000);
		
	System.out.println(	driver.findElement(By.xpath("//a[contains(text(),'Book a Free Demo')]")).getText());
	Thread.sleep(2000);
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("thakare75@gmail.com");
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
	}

}
