package Practics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();		
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement f=driver.findElement(By.xpath("//frame[@src=\"/frame_left\"]"));
        driver.switchTo().frame(f);
        
      
        String data=driver.findElement(By.xpath("//frame[@src=\\\"/frame_left\\\"]")).getText();
        System.out.println( data);
        
        
        
        // WebElement ele=driver.findElement(By.xpath("//frame[@src=\\\"/frame_left\\\"]"));
        // System.out.println( ele.getText());
//		driver.switchTo().frame("mce_0_ifr");
//		
//		driver.findElement(By.xpath("//iframe[@title=\"Rich Text Area\"]")).sendKeys("asdfsdafadf");
//		
//        
//       driver.close();
//        
        
        
        
        
	}
        
        
        
        
        
        


}
