package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(5000);
		
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random=RandomString.make(7);
		
		String Imagename ="Redbus";
		
		File Dest=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Screenshot\\"+Imagename+" "+Random+".jpg");
		
		FileHandler.copy(source, Dest);
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
