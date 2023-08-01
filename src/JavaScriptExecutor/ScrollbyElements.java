package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbyElements {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN");
		     
              
                JavascriptExecutor  js1= (JavascriptExecutor)driver;
                
            WebElement element=  driver.findElement(By.xpath("//select[@class=\"form-control video-selection\"]"));
                
            System.out.println(element.getText());
            
           js1.executeScript("arguments[0].scrollIntoView(true);",element);   
             
          //  js1.executeScript("arguments[0].scrollIntoView(true);", element);;
                
            
            
            
            
            
            
            
            
            
            
            
            
	}
	
	
	

}
