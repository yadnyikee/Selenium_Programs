package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screebshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Dest=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Screenshot\\.Sample.jpg");
		
		FileHandler.copy(source, Dest);
		
		driver.quit();
		

	}

}
