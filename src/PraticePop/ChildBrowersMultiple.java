package PraticePop;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowersMultiple {

	public static void main(String[] args) {
		Set<String>winds;
		Iterator <String>iterator;
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium related all files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String id = driver.getWindowHandle();
				System.out.println(id);
				
				//multiple windows
				//iterate ---get respective window --- switch---action
				 winds = driver.getWindowHandles();
				 iterator = winds.iterator();
				String first_window = iterator.next();
				System.out.println(first_window);
				//System.out.println(driver.getCurrentUrl());
				driver.switchTo().window(first_window);
				driver.findElement(By.xpath("//a[text()='Facebook Pay']")).click();

	//second will open second id will genrate
	//iterate ---get respective window----switch ----action
				winds = driver.getWindowHandles();
				 iterator = winds.iterator();
				iterator.next();
				String second_window = iterator.next();
				System.out.println(second_window);
				
				driver.switchTo().window(second_window);
				//System.out.println(driver.getCurrentUrl());

				System.out.println("title of second window:"+driver.getTitle());
				driver.findElement(By.xpath("//a[text()='Facebook Payments Privacy Policy']")).click();
				
				//third will open id will genrate
				//iterate---get respective window---switch---action
				 winds = driver.getWindowHandles();
				 iterator = winds.iterator();
				iterator.next();//parent window
				iterator.next();//2 window
				String third_window = iterator.next();
				System.out.println(third_window);
				driver.switchTo().window(third_window);
				System.out.println("title of third window:"+driver.getTitle());
				driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("prajakta");
				driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("prajakta@1234");
				driver.switchTo().window(first_window);
				driver.getCurrentUrl();
				driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("prajakta");
				driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("prajakta@1234");
				//driver.close();
				driver.quit();
			
			
	}

}
