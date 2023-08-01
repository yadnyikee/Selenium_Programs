package handleLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
        WebDriver driver= new ChromeDriver();
        driver.manage () .window() .maximize();
        int broken=0;
		int valid=0;
        		// Implicit wait for 10 secs
        		driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        		// Open URL OF app
        	driver.get("http://newtours.demoaut.com/");
        		//driver.get("https://www.facebook.com/"
        			//	+ "");
        		//driver.get("https://www.amazon.in/");
        		// wait
        		Thread. sleep (5000);
        		// capture links from a webpage
        		//capture links from webpages
        		List<WebElement>links = driver.findElements (By.tagName ("a"));
        		
        		
        		System.out.println(links.size());//nubmer of links 
        		for (int i = 0; i<links.size(); i++) {
        		
        		WebElement element = links.get(i);
        		String url= element. getAttribute("href");//we can get all links present on webpage
        		if(url==null || url.isEmpty()) {//to check the empty or null links
        			System.out.println("URL is empty or null");}
        		
        		URL link = new URL(url);//url is class
        		
        		
        		HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
        		//The openConnection() method of the URL class returns a URLConnection 
        		//object that represents the connection to the URL.
        		Thread.sleep (2000);
        		
        		
        		httpConn.connect();//Establish connnetction to url
        		int rescode = httpConn.getResponseCode(); 
        		
        		if (rescode >= 400) {
        		System.out.println(url + " - "+"  is broken link");
        		broken++;
        		}
        		else {
        		System.out.println(url + " - " +"  is valid link");
        		valid++;
        	}
        		
        		
        	}System.out.println("broken links--->"+broken);
    		System.out.println("valid links--->"+valid);
        }
			
			
			
			
		
		
			
		
	}


