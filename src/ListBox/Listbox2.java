package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		   WebDriver driver=new ChromeDriver();
				
			driver.manage().window().maximize();
				
		   	driver.get("https://www.facebook.com/");
		   	
		   	
		   	driver.findElement(By.linkText("Create new account")).click();
		   	
		   	
		   	Thread.sleep(2000);
		   	
		   	driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("swapnil");
		   	
		   	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2] ")).sendKeys("thakare");
		   	
		   	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("456789");

		   	driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]")).sendKeys("jfjfuuuuu");
		   	
		   	
		   	
		   	WebElement Day=driver.findElement(By.id("day"));
		   	
		   	WebElement Month=driver.findElement(By.id("month"));
		   	
		   	WebElement Year=driver.findElement(By.id("year"));
		   	
		   	
		  	Select select1=new Select(Day);
		   	
		   	select1.selectByVisibleText("4");
		   	
		   	
		   	Select select2=new Select(Month);
		   			
		   	select2.selectByVisibleText("Mar");		
		   	
		   	
		   			
		   	Select select3=new Select(Year);		
		   			
		   	select3.selectByVisibleText("2023")	;	
	   	
		 
		   	//select by value
		   	
	/*	   	Select select4=new Select(Day);
		   	select4.selectByValue("4");
		   	
		   	Select select5=new Select(Month);
		   	select5.selectByValue("4");
		   	
		   	Select select6=new Select(Year);
		   	select6.selectByValue("2023");
		   	
		   	*/
		   	//select by index
		   		
//		 	Select select7=new Select(Day);
//		   	select7.selectByIndex(4);
//		   	
//		   	Select select8=new Select(Month);
//		   	select8.selectByIndex(1);
//		   	
//		   	Select select9=new Select(Year);
//		   	select9.selectByIndex(0);
		
		  	driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
		   	Thread.sleep(2000);
		   	
		   	driver.close();
		   	
		
	}

}
