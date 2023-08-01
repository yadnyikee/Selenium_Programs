package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBorder {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		        WebDriver driver = new ChromeDriver();
		        
		        driver.get("https://www.facebook.com/");
		        
		        driver.manage().window().maximize();
		        
                Thread.sleep(4000);
                
                JavascriptExecutor js=(JavascriptExecutor)driver;
                
                WebElement ele=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
            
                js.executeScript("arguments[0].style.border='20px solid red'", ele);

                WebElement ele1=driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
                
                js.executeScript("arguments[0].style.border='20px solid red'", ele1);
                
                
                
                
                
              
	}
	
	
	

}
