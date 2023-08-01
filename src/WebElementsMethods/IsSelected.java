package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {//return type boolean

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
    	driver.get("https://www.facebook.com/");
    	
    	
    	driver.findElement(By.linkText("Create new account")).click();
    	
    	
    	Thread.sleep(2000);
    	
    	//driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
    	
	    //Thread.sleep(1000);
    	
    //	driver.findElement(By.id("u_q_4_nG")).click();
    	
    	
    	
    	
    	driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
    	System.out.println(driver.findElement(By.xpath("//input[@value=\"2\"]")).isSelected());
    	
    	
    	
    	Thread.sleep(4000);
    	
    	driver.close();

	}

}
