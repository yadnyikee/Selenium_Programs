package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox1 {

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
   	
   	
   	//Thread.sleep(4000);
   	
   	
   	driver.findElement(By.id("day")).click();
   	
   	driver.findElement(By.xpath("//option[@value='6']")).click();
   	
   	
   	driver.findElement(By.id("month")).click();
   	driver.findElement(By.xpath("//option[contains(text(),'Oct')]")).click();
   	
   	
   	
   	driver.findElement(By.id("year")).click();
   	driver.findElement(By.xpath("//option[contains(text(),'2022')]")).click();
   	
   	driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
   	
   	driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
   	
   	
   	Thread.sleep(4000);
   	
   	driver.close();

	}


	}


