package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe3 {

	public static void main(String[] args) throws InterruptedException {//frame inside frame
		

		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		WebElement outerframe=driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		
		driver.switchTo().frame(outerframe);
		
		String text1=driver.findElement(By.xpath("//div[@class=\"iframe-container\"]")).getText();
		
		System.out.println(text1);
		
		
		Thread.sleep(3000);
		
//		WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
//		
//		
//		driver.switchTo().frame(innerframe);
//		
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("123456");
//		
//		Thread.sleep(3000);
		
		
		
		
		
		driver.switchTo().parentFrame();
		
		System.out.println(text1);
		
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		driver.quit();
		
	}

}
