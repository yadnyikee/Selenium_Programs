package PageObject_without_DDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseORTestClass {

	public static void main(String[] args) {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Loginpage lp=new Loginpage(driver);
		
		lp.URL();
		lp.Usermail("Admin");
		lp.Password("admin123");
		lp.Login();
		
		DashBoardPage DP=new DashBoardPage(driver);
		DP.NameValidation();
		DP.TimeCheck();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
