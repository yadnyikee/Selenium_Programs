package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1of1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement wb=driver.findElement(By.xpath("//select[@class=\"combobox\"]"));
		
		String str1="doc2";
		demo1(wb,str1);
		
		
		
		
	}
	
	
	public static void demo1(WebElement element,String str) {
		
		Select s1=new Select(element);
		s1.selectByVisibleText(str);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}