package MapInterface;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest2 {
	public static HashMap<String, String> Logindata() {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A", "Ketan:Ketan123");
		hm.put("B", "Akash:Akash123");
		hm.put("C", "swapnil:swapnil123");
		hm.put("D", "thakare:thakare123");
		
		return hm;
	}

	public static void main(String[] args) {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");

		String Name = Logindata().get("B");

		String arr[] = Name.split(":");

		driver.findElement(By.id("email")).sendKeys(arr[0]);

		driver.findElement(By.id("pass")).sendKeys(arr[1]);

		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();

		String actualTItle = driver.getTitle();
		
		System.out.println(actualTItle);
		
		if (actualTItle.equals("Log in to Facebook1")) {
			System.out.println("Correct title");
		} else {
			System.out.println("incorrect title");

		}
	}

}
