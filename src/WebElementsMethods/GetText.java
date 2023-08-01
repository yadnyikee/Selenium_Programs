package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
		
		String ExpText="Facebook helps you connect and share with the people in your life.";
		
		driver.manage().window().maximize();
		
   	   
   	    
   	 String ActualTExt=driver.findElement(By.xpath("//h2[contains(text(),\"Facebook helps\")]")).getText();
   	
     //  String ActualText= driver.findElement(By.xpath("//h2[contains (text(), \"Facebook helps you \")]")).getText();
		if(ExpText.equals(ActualTExt))
			System.out.println("correct text");
		else
			System.out.println("incorrect text");
		
		
   	    Thread.sleep(4000);
   	    
   	    driver.close();

	}

}
