package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		
		   WebDriver driver=new ChromeDriver();
				
			driver.manage().window().maximize();
				
		   	driver.get("https://demo.automationtesting.in/Frames.html");

		   	Thread.sleep(3000);
		   	
		   
		   	driver.switchTo().frame("singleframe");
		   	
		   	
		   	driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("12345");
		   	
		  	Thread.sleep(3000);
		  	
		   	driver.close();
		   
		

	}

}
