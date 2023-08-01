package JavaScriptExecutor;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBorderbyMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		        WebDriver driver = new ChromeDriver();
		        
		        driver.get("https://www.facebook.com/");
		        
		        driver.manage().window().maximize();
		        
                Thread.sleep(4000);
                
                WebElement ele1=driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
                WebElement ele2=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
                WebElement ele3=driver.findElement(By.xpath("//button[@name=\"login\"]"));
                HighlightBorderbyMethod.border(driver,ele1);
                HighlightBorderbyMethod.border(driver,ele2);
                HighlightBorderbyMethod.border(driver,ele3);
                
	}        
                
                public static void border(WebDriver driver,WebElement element) {
                	
                	JavascriptExecutor js=(JavascriptExecutor)driver;
                	js.executeScript("arguments[0].style.border='20px solid red'", element);
                	
                	
                }
                
                
                
                
                
                
                
                
                
                
                
                
                
                
	}


