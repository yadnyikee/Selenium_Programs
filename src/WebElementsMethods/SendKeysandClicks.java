package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysandClicks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
	    	driver.get("https://www.facebook.com/");
	    	
	    
	    	
	    //	driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
	    	
	    	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	    	Thread.sleep(4000);
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	driver.close();
	    	
	    	
	    	

	}

}
