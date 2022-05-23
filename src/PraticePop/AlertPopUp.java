package PraticePop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium related all files\\chromedriver\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		
		   //name="__tcfapiLocator"
		   driver.switchTo().frame("iframeResult");
		  WebElement tryit = driver.findElement(By.xpath("//button[text()='Try it']"));
		  tryit.click();
		  Alert al =driver.switchTo().alert();
		  System.out.println(al.getText());
		  al.accept();
		
		
	}

}
