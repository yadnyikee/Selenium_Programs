package FrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM_With_DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String path="C:\\Users\\HP\\eclipse-workspace\\selenium_program\\TestData\\Book1.xlsx";
		
		FileInputStream file1=new FileInputStream(path);
		
		String username=WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		
		FileInputStream file2=new FileInputStream(path);
		
		String password=WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
       FileInputStream file3=new FileInputStream(path);
		
		String name=WorkbookFactory.create(file3).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(name);
		Thread.sleep(3000);
		String name1=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		
		System.out.println(name1);
		
		if(name.equals(name1)) {
			System.out.println("login is successfully");
		}
		else
		{
			System.out.println("login is not successfully");
		}
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
