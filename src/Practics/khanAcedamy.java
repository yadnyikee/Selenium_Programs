package Practics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class khanAcedamy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

	    WebDriver driver= new ChromeDriver();
	    
	    driver.get("https://www.khanacademy.org/");
	    
	    driver.manage().window().maximize();
	    
	  Thread.sleep(3000);
	  
	 // JavascriptExecutor js=(JavascriptExecutor)driver;
	  
	 
	    //to click in login
	    driver.findElement(By.xpath("//a[@id=\"login-or-signup\"]")).click();
	    
	    Thread.sleep(3000);
	    WebElement element=driver.findElement(By.id("uid-login-form-0-wb-id-identifier-field"));
        System.out.println(element.getText());
	    
	  //  js.executeScript("argument[0].scrollIntoview(true);",element);
	    
	    //to enter the email id
	    
	    driver.findElement(By.xpath("//input[@data-test-id=\"identifier-field\"]")).sendKeys("thakare7587@gmail.com");
	    
	    //to enter the password
	    
	    driver.findElement(By.xpath("//input[@data-test-id=\"password-field\"]")).sendKeys("Venom@456",Keys.ENTER);
	    
	    //to check weather user is same or not
//	    Thread.sleep(5000);
//	   driver.findElement(By.xpath("//a[@data-test-id=\"side-nav-profile\"]")).click();
	   
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//span[@class=\"empty-field pure-hidden-xs\"]")).click();
	   Thread.sleep(5000);
	   
	   driver.findElement(By.id("username")).sendKeys("thakre@gmai.com");
	   String name=driver.findElement(By.xpath("//input[@id=\"nickname\"]")).getText();
	    System.out.println(name);
	    
//	    String ActualName=driver.findElement(By.xpath("//span[@class=\"_wozql4 _13hnk7qk\"]")).getText();
//	    
//	    String expectedName="thakare7587";
//	    
//	    if(ActualName.equals(expectedName)) {
//	    	System.out.println("user is correct");
//	    }
//	    else {
//	    	System.out.println("user not is not correct");
//	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
