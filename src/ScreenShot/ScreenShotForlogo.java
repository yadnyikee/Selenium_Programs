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

public class ScreenShotForlogo {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 
		 driver.get("https://www.hubspot.com/");
		 
		 
		 WebElement logo=driver.findElement(By.xpath("//h1[@class=\"homepage-hero-branding-rollout__text-title -secondary\"]"));
		 
		 
		 File Source= ((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
		
		 
		 String Random=RandomString.make(7);
		 
		 
		 String Imagename="hub";
		 
		 
		 File Dest=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Screenshot\\"+Imagename+" "+Random+".jpeg");
		 
		 
		 FileHandler.copy(Source, Dest);
		 
		 
		 driver.quit();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
