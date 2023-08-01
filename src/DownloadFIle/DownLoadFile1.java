package DownloadFIle;
import java.io.File;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownLoadFile1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		ChromeOptions Option=new ChromeOptions();
		
		String downloadFilepath=System.getProperty("C:\\Users\\HP\\eclipse-workspace\\selenium_program\\Downlaod");
		
		HashMap<String,Object> chromePrefs = new HashMap<String,Object>();
		
		chromePrefs.put("profile.default_content_settings.popups", 0);//to block pop which come when you downlaod the fiel
		
		chromePrefs.put("download.default_directory", downloadFilepath);
		
		Option.setExperimentalOption("prefs",chromePrefs);
		
		Thread.sleep(5000);
		
		WebDriver driver=new ChromeDriver(Option);
		driver.get("https://omayo.blogspot.com/p/page7.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href=\"https://github.com/arunmotoori/DownloadDemo/archive/master.zip\"]")).click();
		
	//	File file=new File()
		
	
	}

}
