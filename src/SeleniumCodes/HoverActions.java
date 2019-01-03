package SeleniumCodes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverActions {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	  driver.get("https:/"
	  		+ "/www.amazon.in/");
	  
	  // How to perform hover inside hover
	  
	  WebElement Search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	  WebElement MainMenu=driver.findElement(By.xpath("//span[@class='nav-line-2' and text()='Category']"));
	  WebElement computers=driver.findElement(By.xpath("//span[@class='nav-text' and text()='Mobiles, Computers']"));
	  WebElement laptops =driver.findElement(By.xpath("//span[@class='nav-text' and text()='Laptops']"));
	  
	  Actions action = new Actions(driver);
	//action.moveToElement(Search).click().keyDown(Keys.SHIFT).sendKeys("gift").doubleClick().contextClick().build().perform();
	
	  //action.moveToElement(MainMenu).build().perform();
	 // computers.click();
	    
	     //Set<String> elements= driver.getWindowHandles();
	     //System.out.println(elements.size());
	  
		action.moveToElement(MainMenu).build().perform();
		Thread.sleep(1000);
		action.moveToElement(computers).build().perform();
		Thread.sleep(1000);
		laptops.click();
		//action.moveToElement(SubMenu).build().perform();
		 
		
	
        //System.out.println(SubMenu.getText());
	}

}
