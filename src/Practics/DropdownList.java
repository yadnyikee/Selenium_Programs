package Practics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownList {

	public static void main(String[] args) {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.id("drop1")).click();

		List<WebElement> data=driver.findElements(By.tagName("option"));
		System.out.println("total member present in the list-->"+data.size());
		
		for(WebElement ele:data) {
			System.out.println(ele.getAttribute("id"));
		}
 		
	}

}
