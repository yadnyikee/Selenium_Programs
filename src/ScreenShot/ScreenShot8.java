package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot8 {
static WebDriver driver;



	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		 driver=new ChromeDriver();
	
		    driver.get("https://kite.zerodha.com/");
				Thread.sleep(4000);
		   driver.manage().window().maximize();
		   
		   String FileName="kite";
		   ScreenShot8.Screenshotmethod(FileName); 
		   ScreenShot8.Screenshotmethod("Test11" +FileName);   
		   ScreenShot8.Screenshotmethod("Test12" +FileName); 
	}
		   public static void Screenshotmethod(String FName ) throws IOException {
				
				File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String Random = RandomString.make(5);
				File Destination= new File("C:\\Users\\A\\eclipse-workspace\\Pallavi_Automation\\screenshot\\"+FName+" "+Random+" .jpeg");
				FileHandler.copy(Source, Destination);
				driver.quit();
	}

}
