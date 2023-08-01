package Pupups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildwindowbrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@href=\"#Seperate\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		Thread.sleep(3000);
		
		String parentwindow=driver.getWindowHandle();
		
		System.out.println(parentwindow);
		
		Set<String>Childwindows=driver.getWindowHandles();
		
		for(String Childwindow:Childwindows) {
			if(!parentwindow.equalsIgnoreCase(Childwindow)) {
				driver.switchTo().window(Childwindow);
				
				Thread.sleep(4000);
			String text1=driver.findElement(By.xpath("//h1[contains(text(),\"Selenium automates browsers. That's it!\")]")).getText();
			
			System.out.println(text1);
			
			driver.close();
				
			}
		
		}
		driver.switchTo().window(parentwindow);
		
		String text3=driver.findElement(By.id("Seperate")).getText();
		System.out.println(text3);
		
		driver.quit();
	}

}
