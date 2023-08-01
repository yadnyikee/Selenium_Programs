package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable123 {

	public static void main(String[] args) {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement element=driver.findElement(By.xpath("(//div[@class=\"w3-example\"])[1]"));
		
		js.executeScript("arguments[0].scrollIntoView();", element);

		List<WebElement> row=driver.findElements(By.xpath("//table[@class=\"ws-table-all\"]//tbody//tr"));
		System.out.println(row.size());
		
	//	int row1=driver.findElements(By.xpath("//table[@class=\"ws-table-all\"]//tbody//tr")).size();
		
		
		List<WebElement> column=driver.findElements(By.xpath("//table[@class=\"ws-table-all\"]//tbody//tr//th"));
		System.out.println(column.size());
		String data1;
		
		String name="Francisco Chang";
		for(int i=2;i<=row.size();i++) {
			for(int j=1;j<column.size();j++) {
			 data1=driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]//tbody//tr["+i+"]//td["+j+"]")).getText();
		        System.out.println(data1);
		        if(name.equals(data1)) {
		        	System.out.println(i+"  "+j);
		        	break;
			}
	        }
		}
		
	}

}












