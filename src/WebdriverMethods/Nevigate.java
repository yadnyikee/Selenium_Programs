package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nevigate {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		driver.navigate().to("https://www.typing.com/student/lesson/359/j-f-and-space");
		
		String title1=driver.getTitle();
		
		System.out.println(title1);
	
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.close();
	}

}
