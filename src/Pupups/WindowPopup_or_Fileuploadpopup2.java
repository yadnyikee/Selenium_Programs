package Pupups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup_or_Fileuploadpopup2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id=\"input-4\"]")).sendKeys("C:\\\\Users\\\\HP\\\\OneDrive\\\\Desktop\\\\11March_Data.xlsx");
		
	//	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	//	Thread.sleep(4000);
		
	//	driver.close();
		
		
		
		
		
	}

}
