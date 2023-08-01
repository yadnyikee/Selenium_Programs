package Practics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ProgramOnFirefox {

	public static void main(String[] args) {
	
	
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\FireFox\\geckodriver.exe");
					
			WebDriver driver = new FirefoxDriver();

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");

			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");

			driver.findElement(
					By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"))
					.click();


	
	}
}
