package misc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleTooltip {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://dsportalapp.herokuapp.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String text=driver.findElement(By.name("username")).getAttribute("validationMessage");
		System.out.println(text);
	}

}
