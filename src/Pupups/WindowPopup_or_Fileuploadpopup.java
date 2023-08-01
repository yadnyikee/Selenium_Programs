package Pupups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup_or_Fileuploadpopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href=\"/upload\"]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\11March_Data.xlsx");
		
		driver.findElement(By.id("file-submit")).click();
		
		String data=driver.findElement(By.xpath("//div[@id=\"uploaded-files\"]")).getText();
		
		System.out.println(data);
		
		Thread.sleep(4000);
		
		driver.close();
		
		
		
		
		
	}

}
