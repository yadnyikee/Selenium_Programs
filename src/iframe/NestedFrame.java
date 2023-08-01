package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
	    Thread.sleep(2000);
	    
	    driver.switchTo().frame("frame-left");
	    
	 String data1=   driver.findElement(By.xpath("//frame[@src=\"/frame_left\"]")).getText();
	 
//	 String data2=   driver.findElement(By.xpath("//frame[@src=\"/frame_middle\"]")).getText();
//	 
//	 String data3=   driver.findElement(By.xpath("//frame[@src=\"/frame_right\"]")).getText();
//	 
//	 String data4=   driver.findElement(By.xpath("//frame[@src=\"/frame_bottom\"]")).getText();
	 
	 driver.close();

	}

}
