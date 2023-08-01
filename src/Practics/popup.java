package Practics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {//all type of javascript popup accept,dismiss,senkeys.

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Alert alt=driver.switchTo().alert();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		
		//Thread.sleep(4000);
		
		String msg=driver.switchTo().alert().getText();
		
		System.out.println(msg);
		//Thread.sleep(4000);
		
		alt.accept();
		
		driver.findElement(By.xpath("//a[contains (text(), \"Alert with OK & Cancel \")]")).click();
		
		//Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]")).click();
		
	//	Thread.sleep(2000);
		//second approch for popup
		
		
		System.out.println(alt.getText());
		
		alt.dismiss();
		
		System.out.println(driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText());
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		
		driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
		
		Thread.sleep(2000);
		
		alt.sendKeys("swapnil");
		
		alt.accept();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//p[@id=\"demo1\"]")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
