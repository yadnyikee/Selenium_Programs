package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        
        
        
        Thread.sleep(4000);
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement username=driver.findElement(By.id("email"));
        
        WebElement password=driver.findElement(By.id("pass"));
        
        js.executeScript("arguments[0].value='"+"Test"+"';",username);
        js.executeScript("arguments[0].value='"+"Test123"+"';",password);  
        
        WebElement login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
        js.executeScript("arguments[0].click()",login );

	}

}
