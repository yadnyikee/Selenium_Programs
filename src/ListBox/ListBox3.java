package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {


	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
			
		 System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		 
			driver.manage().window().maximize();
				
		   	driver.get("https://www.facebook.com/");
		   	
		   	
		   	driver.findElement(By.linkText("Create new account")).click();
		   	
		   	
		   	
		   	Thread.sleep(5000);
		   	
		   	driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("swapnil");
		   	
		   	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2] ")).sendKeys("thakare");
		   	
		   	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("456789");

		   	driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]")).sendKeys("jfjfuuuuu");
			
		 /*  	WebElement Day=driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		   	WebElement Day =driver.findElement(By.xpath("//select[@class=\"_9407 _5dba _9hk6 _8esg\"]"));
		   	
		   	WebElement Month=driver.findElement(By.id("month"));
		   	
		   	WebElement Year=driver.findElement(By.id("year"));*/
		   	
		   	
		   	WebElement Day =driver.findElement(By.xpath("//select[@class=\"_9407 _5dba _9hk6 _8esg\"]"));
			WebElement Month =driver.findElement(By.xpath("//select[@title=\"Month\"]"));
			WebElement Year = driver.findElement(By.xpath("//select[@aria-label=\"Year\"]"));
			
			
			
			
		   	
		  /* 	String DOB="6/10/1995";
		   	
		   	String[]Date=DOB.split("/");
		   	
		   	ListBox(Day,Date[0]);
		   	
		   	ListBox(Month,Date[1]);
		   	
		   	ListBox(Year,Date[2]); 
		   	
		   	
		   	/*
		   	
		   	WebElement Day =driver.findElement(By.xpath("//select[@class=\"_9407 _5dba _9hk6 _8esg\"]"));
			WebElement Month =driver.findElement(By.xpath("//select[@title=\"Month\"]"));
			WebElement Year = driver.findElement(By.xpath("//select[@aria-label=\"Year\"]"));
			*/
			Listbox(Day,9);
			Listbox(Month,4);
			Listbox(Year,19);
			
			/* OR */
		
		 
		   	
		   	driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
		   	Thread.sleep(8000);
		  //	driver.close();
		   	
	}

		   	
		   	public static  void Listbox(WebElement element,int Text) {
		   //select is class of webdriver which provide method to inteact with dropdown list on webpage

			  	Select select1=new Select(element);
			   		select1.selectByIndex(Text); 
			   		
			   		
		   	}
		   	
		   	
	
		   	
		   	
		   	
		   	
		   	
		   	
		   	
		   	
		   	
		   	
		   	
		   	
		   	
		   	

	}

	