package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathbyAttribute {//on orange hrm

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
	
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@class=\"email text tryit-email\"]")).sendKeys("st@gmail.com");
		//driver.findElement(By.xpath("//input[@name=\"action_request\"]")).click();
	//	driver.findElement(By.xpath("[@id="Form_submitForm_EmailHomePage"]")).sendKeys("st@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@name=\"EmailHomePage\"]")).sendKeys("thakare7587@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		

		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/section[1]/div[2]/div/div/div/div/div/form/fieldset/div[1]/div/input")).sendKeys("thakare7587@gmail.com");
		
		Thread.sleep(4000);
		
		
		driver.close();

	}

}
