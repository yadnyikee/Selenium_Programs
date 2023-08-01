package handleLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleLink1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
	    Thread.sleep(2000);
	   
	    List<WebElement> element=driver.findElements(By.tagName("a"));
	    System.out.println("total links present on website are--->"+element.size());
	    
	    
	    for(int i=0;i<element.size();i++) {
	    	System.out.println(element.get(i).getAttribute("href"));
	    	//System.out.println(element.get(i).getText());
	    }
	    
	    
	}

}
