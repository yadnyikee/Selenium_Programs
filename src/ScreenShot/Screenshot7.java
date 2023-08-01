package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot7 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
			 
			 WebDriver driver=new ChromeDriver();
			 
			 
			 driver.get("https://kite.zerodha.com//");
			 
			 
			 WebElement logo=driver.findElement(By.xpath("//h2[text()='Login to Kite']"));
			 
			 
			File source= ((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
			 
			
			String Random=RandomString.make(7);
			 
			 
			 String Imagename="kite";
			 
			 
			 File dest=new File("C:\\Users\\HP\\eclipse-workspace\\selenium_program\\ScreenShot\\"+Imagename+" "+Random+".jpeg");
			 
			 
			 FileHandler.copy(source, dest);
			 
			 
			 
			 driver.quit();
			 
			 
			 
//		  WebDriver driver= new ChromeDriver();
//		    driver.get("https://kite.zerodha.com/");
//				Thread.sleep(4000);
//		   driver.manage().window().maximize();
//		   
//		 // Take a screenshot of the  "Kite to login" text and store it in the project folder.
//		   
//			  WebElement LoginText= driver.findElement(By.xpath("//h2[text()=\"Login to Kite\"]"));
//			 File Source= ((TakesScreenshot)LoginText).getScreenshotAs(OutputType.FILE);
//			      String Random = RandomString.make(5);
//		String ImageName="kite";
//			 
//		File Destination= new File("C:\\Users\\HP\\eclipse-workspace\\selenium_program\\ScreenShot\\"+ImageName+" "+Random+" .jpeg");
//		FileHandler.copy(Source, Destination);
//		driver.quit(); 
//			 
			 
			 
			 
			 
			 

	}

}
