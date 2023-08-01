package Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6_Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
	    Thread.sleep(2000);
	    
	  //  2.Get the current window’s handle and write to the console window. It must be the first window handle.
	    String currentwindowhandle=driver.getWindowHandle();
	    
	    System.out.println("current window handle----->"+currentwindowhandle);
	    System.out.println();
	   // 3.Locate the “Visit W3Schools.com!” link and click it. 
	    driver.switchTo().frame("iframeResult");
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Visit W3Schools.com!')]")).click();
	    
	  //  4.Get all window handles and hold them in a list.
	    Set<String> windowid=driver.getWindowHandles();
	    
	  //  5.Write to total window handle number to the console. It must be 2.
	    System.out.println("total window handle size is --->"+windowid.size());
	    System.out.println();
	    Iterator<String> id=windowid.iterator();
	    
	    String parentwindow=id.next();
	    
	    String childwindow=id.next();
	   // 6.Switch t0 the second window. 
	    driver.switchTo().window(childwindow);
	    
	  //  7.Get the current window’s handle and write to the console window. It must be a second window handle. 
	    System.out.println("a second window handle--->"+childwindow);
	    System.out.println();
	    System.out.println("second window title---."+driver.getTitle());
	    System.out.println();
	 //   8.Check the upper left side logo in the second window.   
	    boolean logo=driver.findElement(By.xpath("//i[@style=\"position:relative;z-index:1;color:#04AA6D;font-size:36px!important;\"]")).isDisplayed();
	    
	    System.out.println(logo);
	    System.out.println();
	  //  9.Go back (Switch) to the first window. 
	    driver.switchTo().window(parentwindow);
	    System.out.println("parent window title-->"+driver.getTitle());
	//    10.Get the current window’s handle and write to the console window. It must be the first window handle. 
	    System.out.println("a first window handle--->"+parentwindow);
	    
	//    11.Check the See Run Button Text. It must contain “Run >” text.   
	    String text=driver.findElement(By.id("runbtn")).getText();
	    
	    System.out.println(text);
	    
	    driver.quit();
	  
	}

}
