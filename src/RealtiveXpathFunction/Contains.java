package RealtiveXpathFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {//differnce between start with and contains is if we provide partail vallue then also it work-for contais 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[contains(@type,\"ema\")]")).sendKeys("thakare7587@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@class,\"action btn btn-ohrm btn-tryit-free\")]")).click();
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
