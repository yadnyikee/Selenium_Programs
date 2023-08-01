package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
	   	driver.get("https://www.facebook.com/");
		  
		   	driver.manage().window().maximize();

		   	Thread.sleep(3000);
		   	
	WebElement input1=	driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]"));
		   	
	WebElement input2=driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]"));
  	Thread.sleep(3000);
	
		input1.sendKeys("swapnnil@gmail.com");
		
		Actions act=new Actions(driver);
		
		//ctrl+a  select all text
		
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		//ctrl+c to copy all text
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		
		//tab
		act.sendKeys(Keys.TAB);
		act.build().perform();
		
		
		//ctrl+v to paste all text
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		//System.out.println(input1.getAttribute("value"));
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("correct copied");
		}
		else
			System.out.println("incorrect copied");
		
		

	}

}
