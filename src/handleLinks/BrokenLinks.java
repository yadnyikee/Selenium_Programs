package handleLinks;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import jakarta.xml.bind.Element;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage () .window() .maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> tags=driver.findElements(By.tagName("a"));
		System.out.println("total tags present on the page are--->"+tags.size());
		
		int brokenlinks=0;
		
		for(WebElement links:tags) {
			
			String url=links.getAttribute("herf");
			
			if(url==null||url.isEmpty()) {
				System.out.println("url is empty or null");
		
			}
			URL Link=new URL(url);
			
			HttpsURLConnection httpscode=(HttpsURLConnection) Link.openConnection();
			
			httpscode.connect();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
