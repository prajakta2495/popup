package PraticePop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium related all files\\chromedriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://en.wikipedia.org/wiki/List_of_states_and_union_territories_of_India_by_population");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 int rows = driver.findElements(By.xpath("//table[@class=\"wikitable sortable jquery-tablesorter\"]/tbody/tr")).size();
				System.out.println(rows);
				int columns = driver.findElements(By.xpath("//table[@class=\"wikitable sortable jquery-tablesorter\"]/tbody/tr[1]/td")).size();
				System.out.println(columns);
				
				for(int r= 1;r<=rows;r++) {
					for(int c= 1;c<=columns;c++) {
						String values = driver.findElement(By.xpath("//table[@class=\"wikitable sortable jquery-tablesorter\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
					System.out.print(","+values);
					}
					System.out.println();
				}


		
	}
}
		
		//comma separated values !!!!!!!!!!!
		
		
		
		
		
		
		
		

