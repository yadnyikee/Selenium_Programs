package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_contextcClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
			
				
		   	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		  
		   	driver.manage().window().maximize();

		   	Thread.sleep(3000);
		   	
		   	WebElement ele=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		   	
		   	Actions act=new Actions(driver);
		   	
		   act.contextClick(ele).build().perform();
		   
		   driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
		   
		   System.out.println(driver.switchTo().alert().getText());
		   Thread.sleep(3000);
		   	
		   	driver.switchTo().alert().accept();
		   	
		   	driver.close();
		   	
		   	
		   	
		   	
		   	
		   	
		   	
		   	
		   	
		   	
		   	

	}

}
