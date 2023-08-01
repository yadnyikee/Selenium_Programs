package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_Up_till_bottom {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver,Chrome,driver",
				"C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/");

		driver.manage().window().maximize();

		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// for scroll down till bottom

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

		Thread.sleep(4000);
		// for scrollup
		js.executeScript("document.documentElement.scrollTop=0", "");

	}

}
