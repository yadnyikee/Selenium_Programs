package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultiSelectBox {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("http://omayo.blogspot.com/");
//		
//		driver.manage().window().maximize();
//		
//		Thread.sleep(5000);
//		
//		
//	   WebElement el=driver.findElement(By.id("multiselect1"));
//        
//		Select s1=new Select(el);
//		
//		s1.selectByVisibleText("volvo");
//		
//		s1.selectByVisibleText("swift");
//		
//		s1.selectByVisibleText("Hyundai");
//		
//		driver.findElement(By.xpath("//option[@value=\"volvox\"]")).click();
//		
//		driver.findElement(By.xpath("//option[@value=\"swiftx\"]")).click();
//		
//		
//		
//		driver.findElement(By.xpath("//textarea[@cols=\"80\"]")).sendKeys("For single line comment you can use Ctrl + / and for multiple line comment you can use Ctrl + Shift + / after selecting the lines you want to comment in ...\r\n"
//				+ "17 answers\r\n"
//				+ " \r\n"
//				+ "�\r\n"
//				+ " \r\n"
//				+ "Top answer: \r\n"
//				+ "Ctrl-/ to toggle \"//\" comments and Ctrl-Shift-/ to toggle \"/* */\" comments");
//		
//		
//		
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("kljdflks");
//		
//		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("kl455ks");
//	
		
		
//		
//		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
//		
//		driver.manage().window().maximize();
//		
//		Thread.sleep(2000);
//		
//		
//	driver.findElement(By.xpath("//input[@class=\"form-control select-input focused\"]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[7]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[8]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[9]")).click();	
//	Thread.sleep(2000);
//      
//		Select s1=new Select(el);
//		
//		s1.selectByVisibleText("volvo");
//		
//		s1.selectByVisibleText("swift");
//		
//		s1.selectByVisibleText("Hyundai");
		
		
	WebElement sl=driver.findElement(By.xpath("(//input[@role=\"listbox\"])[]"));
  
	Select  s1=new Select(sl);
	
	s1.selectByVisibleText("One");
	
	s1.selectByVisibleText("Two");
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
