package Practics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();		
		
		driver.get("https://demoqa.com/nestedframes");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
     //   driver.switchTo().frame("frame1");
		
//		String data=driver.findElement(By.xpath("(//h1[@id=\"sampleHeading\"])[1]")).getText();
//		
//		System.out.println(data);
//		 driver.switchTo().frame("frame2");
//			
//			String data1=driver.findElement(By.xpath("(//h1[@id=\"sampleHeading\"])[2]")).getText();
//			
//			System.out.println(data1);
        
        
		       driver.switchTo().frame("frame1");
				
				String data=driver.findElement(By.xpath("//body[contains(text(),'Parent frame')]")).getText();
				
				System.out.println(data);
				
//				 driver.switchTo().frame("frame2");
//					
//					String data1=driver.findElement(By.xpath("(//h1[@id=\"sampleHeading\"])[2]")).getText();
//					
//					System.out.println(data1);
  
  }
}
        
        
        
        
        
        



