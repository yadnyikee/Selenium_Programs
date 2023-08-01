package WindowHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Windowhandle2 {

	public static void main(String[] args) throws InterruptedException {   
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();
		
		Thread.sleep(3000);
		
		Set<String> windowid=driver.getWindowHandles();
		//all id of the open window get store in set of string
		
		//first method using iterator
		
		Iterator<String> it=windowid.iterator();
		
		String parentwindow=it.next();
		String childwindow=it.next();
		
		System.out.println("parentwindow id---"+parentwindow);
		System.out.println("childwindow id---"+childwindow);
		
		//second method
		
		List<String> windowlist=new ArrayList(windowid);
		
		String parent=windowlist.get(0);
		
		String child=windowlist.get(1);
		
		System.out.println("parentwindow id---"+parent);
		System.out.println("childwindow id---"+child);
		
		driver.switchTo().window(parent);
		
		Thread.sleep(3000);
		
       System.out.println("parentwindow----"+driver.getTitle());
       
       driver.switchTo().window(child);
       Thread.sleep(3000);
		
       
       System.out.println("childwindow---"+driver.getTitle());
		
		driver.quit();
	
		
		
		
		
		

	}

}
