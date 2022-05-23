package PraticePop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDriver {

	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver", "C:\\selenium related all files\\chromedriver\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.flipkart.com");
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   driver.manage().window().maximize();
   //driver.findElement(By.xpath("//a[text()='Login']")).click();
	
  WebElement mail = driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]"));
  mail.click();
  mail.sendKeys("9923930487");
  
  WebElement pwd = driver.findElement(By.xpath("//input[@type=\"password\"]"));
  pwd.sendKeys("@Omkars18");
		
  WebElement login = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]"));
  login.click();
  
  
 WebElement loginomkar = driver.findElement(By.xpath("//div[text()='Omkar']"));
 loginomkar.click();
 
 
 
 
 
 
	}

}
