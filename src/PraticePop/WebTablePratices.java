package PraticePop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePratices {

	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver","C:\\selenium related all files\\chromedriver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://vikaspedia.in/education/current-affairs/states-and-districts-of-india");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 int rows = driver.findElements(By.xpath("//table[@class=\"grid listing\"]/tbody/tr")).size();
		System.out.println(rows);
		int columns = driver.findElements(By.xpath("//table[@class=\"grid listing\"]/tbody/tr[1]/td")).size();
		System.out.println(columns);
		
		for(int r= 1;r<=rows;r++) {
			for(int c= 1;c<=columns;c++) {
				String values = driver.findElement(By.xpath("//table[@class=\"grid listing\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
			System.out.println("===>"+values);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
