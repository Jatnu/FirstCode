package DataProviderTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
	@BeforeClass
	public void googletest() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	}

	
	@Test(dataProvider="data")
	public void googleTest(String text) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys(text);
		search.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle().startsWith(text));
		driver.close();
		
	}
	
	@DataProvider()
	Object[][] data(){
		return new Object[][] {
			{"dream"},
			{"now real"}
		};
		
	}
	
}
