package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_up_1 {

	public static void main(String[] args) throws InterruptedException {

				System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		        WebDriver driver = new ChromeDriver();
		        
		        driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
		        
		        driver.manage().window().maximize();
		        
                Thread.sleep(4000);
                
                JavascriptExecutor js=(JavascriptExecutor)driver;
                
                //for scroll down
    
                js.executeScript("window.scrollBy(0,9000)", "");
                
                Thread.sleep(4000);
                //for scrollup
                js.executeScript("window.scrollBy(0,-2000)", "");
                
                Thread.sleep(4000);
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
	}
	
	
	

}
