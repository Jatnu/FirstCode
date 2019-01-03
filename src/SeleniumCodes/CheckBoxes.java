package SeleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("http://qaclickacademy.com/practice.php");
		
  WebElement chk1 =driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
  
  boolean t= chk1.isSelected();  
  if(t==false)
  {
       chk1.click();
  
	}
  else
  {
 System.out.println("checkbox1 is already checked");
}
    
  t=chk1.isSelected();
     if(t==true)
     {
    	 System.out.println("Checkbox have been checked now");
     }
  
  
     int count=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
     
     System.out.println(count);
     
	}
}



