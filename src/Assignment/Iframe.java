package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");

		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		
		WebElement data=driver.findElement(By.id("sampleHeading"));
		
	//   System.out.println(data);
		
		String data2=data.getText();
		
		System.out.println(data2);
		
		
		
	}

}
