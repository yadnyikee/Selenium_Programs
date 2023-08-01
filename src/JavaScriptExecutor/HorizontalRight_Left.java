package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalRight_Left {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        
		        driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
		        
		 
                JavascriptExecutor js=(JavascriptExecutor)driver;
                
               //right
    
                js.executeScript("window.scrollBy(10000,00)", "");
               
                Thread.sleep(4000);
                //left
                js.executeScript("window.scrollBy(-2000,00)", "");
                
                Thread.sleep(4000);
                
//                WebDriver driver = new ChromeDriver();
//        		
//        		driver.manage().window().maximize();
//        		
//        		driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
//        		
//        		JavascriptExecutor JS = (JavascriptExecutor) driver;
//        		
//        		// ScrollDown
//        		
//        		JS.executeScript("window.scrollBy(10000,0)", "");                // (scripts, argument)
//        		Thread.sleep(4000);
//        		
//        		// ScrollUp
        		
//        		JS.executeScript("window.scrollBy(-2000,0)", "");
//        		Thread.sleep(4000); 
//                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
	}
	
	
	

}
