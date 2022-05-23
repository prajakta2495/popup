package PraticePop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\selenium related all files\\chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://money.rediff.com/companies/market-capitalisation?src=moneyhome_topmarketcapital_more");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 int row = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr")).size();
 System.out.println(row);
 int column = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]/td")).size();
 
System.out.println(column);
for(int r=1;r<=row;r++) {
	for(int c=1;c<=column;c++) {
		String value = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
	System.out.println(" ====>"+value);
	}
	System.out.println( );
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
