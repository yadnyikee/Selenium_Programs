package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot5 {
	
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.redbus.in/");
		
		String Fname="redbus";
		
		
		ScreenShot5.ScreenShotTake(Fname);
		
		ScreenShot5.ScreenShotTake("demo"+Fname);
		

	}
	
	public static void ScreenShotTake(String filename) throws IOException {
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random=RandomString.make(7);
		
        File Dest=new File("C:\\Users\\HP\\eclipse-workspace\\selenium_program\\ScreenShot\\"+filename+" "+Random+".jpg");
		
		FileHandler.copy(source, Dest);
		
	}
	
	

}
