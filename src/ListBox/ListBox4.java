package ListBox;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
	   	
	   	
	   	
	   	Thread.sleep(2000);
	   	
	   	driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("swapnil");
	   	
	   	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2] ")).sendKeys("thakare");
	   	
	   	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("456789");

	   	driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]")).sendKeys("jfjfuuuuu");
	   	
	   	
	   	
	   	WebElement Day=driver.findElement(By.id("day"));
		
		WebElement Month=driver.findElement(By.id("month"));		
	   			
		WebElement Year=driver.findElement(By.id("year"));	
		
		
		Select s1=new Select(Day);
		List<WebElement> ListDay=s1.getOptions();//important
		
		
		System.out.println("size of the day list");
		System.out.println(ListDay.size());
		
		System.out.println();
		System.out.println();
		
		for(int i=0;i<ListDay.size();i++) {
			
			String Dayvalues=ListDay.get(i).getText();
			System.out.println(Dayvalues);
			
			
			
			if(Dayvalues.equals("14")) {
				
				ListDay.get(i).click();
			
			}
			 
		}
		
	   	
	
		Select s2=new Select(Month);
	
		List<WebElement> Listmonth=s2.getOptions();
		
		
		System.out.println(Listmonth.size());
		
		for(int j=0;j<Listmonth.size();j++) {
			
			String Monthvalues=Listmonth.get(j).getText();
			
			System.out.println(Monthvalues);
			
			
			if(Monthvalues.equals("Mar")) {
				Listmonth.get(j).click();
				
				
			}
			
		}	
			
		Select s3=new Select(Year);
		List<WebElement> Listyear=s3.getOptions();
		
		System.out.println(Listyear.size());
		
		
		
		
		for(int k=0;k<Listyear.size();k++) {
			
			String NOofyear=Listyear.get(k).getText();
			System.out.println(NOofyear);
			
			if(NOofyear.equals("2012")) {
				Listyear.get(k).click();
			}
		
		}
	
		
		
//		for (WebElement s : Listyear) {
//		    String YearValues = s.getText();
//		    System.out.println(YearValues);
//		    
//		    if (YearValues.equals("1996")) {
//		        s.click();
//		    }
//		}
//		
		
		
		
		Thread.sleep(4000);
		
		
		driver.close();
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			
		
		
	}

}
