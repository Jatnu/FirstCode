package SeleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.Select;



public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  WebElement departure=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
	  departure.sendKeys("GOA");
	  
	WebElement Destination =driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
	Destination.sendKeys("DEL");
	
	Select select = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
	  
	  
		select.selectByValue("AED");
		
		// to get all the values of a dropdown
	int count=select.getOptions().size();
	System.out.println(count);
	
	
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
	
	 
	
	}

}
