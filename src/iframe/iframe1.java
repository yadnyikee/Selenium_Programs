package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {

	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		   WebDriver driver=new ChromeDriver();
				
			driver.manage().window().maximize();
				
		   	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		 //  	driver.get("https://demoqa.com/nestedframes");

		   	Thread.sleep(4000);
		   	
		   	driver.switchTo().frame("iframeResult");
		   	
		   	
		   	driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();
		   	
		 	Thread.sleep(4000);
		   	
		   	driver.close();
		   	
		   	
	}

}
