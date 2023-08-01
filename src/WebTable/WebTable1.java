package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.get("http://omayo.blogspot.com/");
		// to scroll the page
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Table')]"));

		js.executeScript("arguments[0].scrollIntoView();", element);

		// how many rows in table

		int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("total number of rows--->" + row);

		// or

		List<WebElement> Row1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println("total number of rows--->" + Row1.size());

		// how many columns in table
		int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("Total number of column-->" + col);

		// retrive all data

		String data2 = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[3]")).getText();
		System.out.println(data2);

		for (int i = 2; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				String data1 = driver
						.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(data1 + "|");

			}
			System.out.println();
		}

	}

}
