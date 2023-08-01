package Locaters;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyAttridutes2 {// on facebook
	public static void main(String[] args) throws InterruptedException  {
		//Step1:
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
			//Step 2:	
		WebDriver driver=new ChromeDriver();
			//Step 3:	
		driver.get ("https://www.facebook.com/");
			
		driver.manage().window().maximize();
		
		//by attribute
       driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("swapnilmachhindra.thakare23@gmail.com");//email 
       
      driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("123456");//password
       
       
      driver.findElement(By.xpath("//button[@name=\"login\"]")).click();//click button
      
    //  driver.findElement(By.xpath("//button[@id=\"loginbutton\"]")).click();
      
     // driver.findElement(By.xpath("[data-testid=\"open-registration-form-button\"]")).click();
    
    //  driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
      
		Thread.sleep(3000);
		
		driver.close();
}
}
