package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripSenKeys {

	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        Thread.sleep(4000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement username=driver.findElement(By.id("email"));
        
        WebElement password=driver.findElement(By.id("pass"));
        
        
        //type1 when id is present 
        js.executeScript("document.getElementById('email').value='Test12';");
        js.executeScript("document.getElementById('pass').value='1231321';");  
        
        
        //type2
        
        js.executeScript("arguments[0].value='"+"Test"+"';",username);
        js.executeScript("arguments[0].value='"+"Test123"+"';",password);  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

	}

}
