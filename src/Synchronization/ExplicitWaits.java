package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {

	public static void main(String[] args) {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();		
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(50));
		
		//WebElement ele1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
		WebElement ele1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type=\"text\"])[1]")));

		ele1.sendKeys("pune");
		
        WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(50));
      //WebElement ele2=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest")));
        WebElement ele2=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class=\"sc-bxivhb hrsLPT\"])[2]")));

		ele2.sendKeys("mumbai");
		
		
		
		
		
	}
	
	
	

}
