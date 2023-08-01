package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle3 {

	public static void main(String[] args) throws InterruptedException {   
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
	    
	    Thread.sleep(2000);

        Set<String> windowid=driver.getWindowHandles();

        Iterator<String> id=windowid.iterator();
        
        String parent=id.next();
        
        String child=id.next();
	    
        System.out.println("parent id--"+parent);
	    
        System.out.println("child id--"+child);
	    
        driver.switchTo().window(child);
	    
	    driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("thakare@gmail.com");
	    
	    Thread.sleep(2000);
	    
	    driver.switchTo().window(parent);
	    
	    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("123456");
	    
	    driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456");
	    
	    Thread.sleep(2000);
	    
	   
	    driver.quit();
	    
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
