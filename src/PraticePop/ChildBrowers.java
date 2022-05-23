package PraticePop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowers {
//single window 
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\selenium related all files\\chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
String id = driver.getWindowHandle();
		System.out.println(id);
		
		
		
		
		
		
		
		
		
	}

}
