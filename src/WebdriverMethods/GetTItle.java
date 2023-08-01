package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTItle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String title=driver.getTitle();//gets title of website of particular page
		
		
		System.out.println(title);
		
		
		Thread.sleep(2000);
        
		
		driver.close();
		
		String ExpectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		
		if(title.equals(ExpectedTitle)){
			System.out.println("correct");
		}
		else {
			System.out.println("not correst");
		
		}
		
		
	}

}
