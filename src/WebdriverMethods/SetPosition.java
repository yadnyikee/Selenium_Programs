package WebdriverMethods;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		Thread.sleep (4000);
		
		driver.manage ().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Point P1 = new Point (300,300);
		
		driver.manage ().window().setPosition(P1);
		
		Thread. sleep (4000);
		
		System.out.println(driver.manage ().window().getPosition());
		
		//driver.close();
	}
}
