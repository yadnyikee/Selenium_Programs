package ScreenShot;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot6 {

	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 
		 driver.get("https://kite.zerodha.com//");
		 
		 
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File ("C:\\Users\\HP\\OneDrive\\Desktop\\Screenshot\\sample1.jpeg");
		 
		FileHandler.copy(source, dest); 
		// WebElement logo=driver.findElement(By.xpath("//h1[@class=\"homepage-hero-branding-rollout__text-title -secondary\"]"));
		 

	}

}
