package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver",
				"C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		Thread.sleep(4000);

		WebElement ele = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

		ele.sendKeys("oneplus");

		Thread.sleep(4000);

		WebElement Links = driver.findElement(By.xpath("//a[@class=\"nav-a  \"]"));
		System.out.println(Links.getText());

		WebElement Links1 = driver.findElement(By.xpath("//a[@class=\\\"navvv-a  \\\"]"));
		System.out.println(Links1.getText());

		driver.close();

	}

}
