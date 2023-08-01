package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
    	driver.get("https://www.facebook.com/");
    	
    	WebElement element =driver.findElement(By.id("email"));
    	
    	element.sendKeys("asdfasdf");
    	
    	Thread.sleep(2000);
    	
    	element.clear();
    	
    	Thread.sleep(4000);
    	
    	WebElement element2=driver.findElement(By.name("pass"));
    	
    	element2.sendKeys("kjfhaskjldhf");
    	
    	element2.clear();
    	
    	Thread.sleep(4000);
    	
    	driver.close();
    	
    	
    	

	}

}
