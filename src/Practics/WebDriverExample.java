package Practics;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.By;

	import java.util.List;

	public class WebDriverExample {
	    public static void main(String[] args) {
	    	System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
	        // Setup ChromeDriver using WebDriverManager
	      //  WebDriverManager.chromedriver().setup();

	        // Create an instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        // Navigate to the website
	        driver.get("https://www.amazon.in/");
	        
	        // Find all the links on the page
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println("Number of links: " + links.size());
	        
	        // Print the text and href attribute of each link
	        for (WebElement link : links) {
	            System.out.println(link.getText());
	            System.out.println(link.getAttribute("href"));
	        }
	        
	        // Quit the browser
	        driver.quit();
	    }
	}

