package dsalgo_DriverFactory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dsalgo_Utilities.Loggerload;

public class DriverFactory {
	public static WebDriver driver=null;
	
	public static void initializeBrowser(String browserName) {
	
		if (browserName.equalsIgnoreCase("chrome")) {
			Loggerload.info("Testing on Chrome"); 
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			Loggerload.info("Testing on Firefox"); 
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			Loggerload.info("Testing on Edge"); 
			driver=new EdgeDriver();
		}
		//return driver;
	}
	
	
	public static WebDriver getDriver() {
		
		//if ( driver == null ) initializeBrowser("chrome");
		return driver;
	}
	
	

}
