package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable3 {
	public static void main(String[] args) {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.xpath("(//h3[contains(text(),'Example')])[1]"));

		js.executeScript("arguments[0].scrollIntoView();", element);

		int row = driver.findElements(By.xpath("//table[@class=\"ws-table-all\"]//tr")).size();
		System.out.println(row);

		int column = driver.findElements(By.xpath("//table[@class=\"ws-table-all\"]//tr//th")).size();
		System.out.println(column);
		
		String ExpectedString="Francisco Chang";
		for(int i=1;i<row;i++) {
			for(int j=1;j<column;j++) {
				System.out.println();
				
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
