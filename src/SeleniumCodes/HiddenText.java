package SeleniumCodes;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class HiddenText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	  driver.get("https:/"
	  		+ "/www.amazon.in/");
	  
	  // How to perform hover inside hover
	  
	  WebElement Search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	  JavascriptExecutor js = (JavascriptExecutor)(driver);
	  
	  Search.sendKeys("time");
	  
	  String script="return document.getElementById(\"twotabsearchtextbox\").value";
	  
	  String text="timer clock";
	  
	  String act="";
//      while(!act.equalsIgnoreCase(text))
//      {
//       	    Search.sendKeys(Keys.DOWN);
//    	   act= (String) js.executeScript(script);
//    	       System.out.println(act);           
//	  
//	}
       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(src,new File("D:\\data D drive\\screenshot.png"));
      
      
}
}
