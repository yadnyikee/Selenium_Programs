package Practics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> id=driver.getWindowHandles();
		
		Iterator<String> it=id.iterator();
		
		String parentid=it.next();
		
		String childid =it.next();
		
		System.out.println("parentwindow--->"+parentid);
		
		System.out.println("childwindow--->"+childid);
		
		//System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		if(parentid.equals(childid)) {
			System.out.println("both are same ");
		}
		else {
			System.out.println("both are not same");
		}
		
		ArrayList<String> al= new ArrayList<String>(id);
		
		 String ParentWindowid = al.get(0);//in window parent index is 0
		 System.out.println(ParentWindowid);
		 
		 String ChildWindowIs= al.get(1);//in window child index is 1
		 System.out.println(ChildWindowIs);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
