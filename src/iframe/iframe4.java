package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult");
		
	String data=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]")).getText();
		
        System.out.println(data);
        
        
    	Thread.sleep(3000);
    	
    	WebElement inner=driver.findElement(By.xpath("//iframe[@src=\"demo_iframe.htm\"]"));
    	driver.switchTo().frame(inner);
    	
    	String innertext=driver.findElement(By.xpath("//body[@style=\"background-color:powderblue\"]")).getText();
    	
    	
    	System.out.println(innertext);
    	
    	driver.close();
	
	
	}

}
