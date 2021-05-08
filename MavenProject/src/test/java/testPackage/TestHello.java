package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHello {
	public WebDriver driver;
  @Test
  public void printtextvalue() {
	  
	  driver.navigate().to("https://www.google.com/");
	  driver.manage().window().maximize();
	  driver.getTitle();
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  String FilePath="";
	try {
		FilePath = new java.io.File(".").getCanonicalPath()+ "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",FilePath);
		driver=new ChromeDriver();
		
		
	  }
	 catch (IOException ex)
	  {
		  System.out.println (ex.toString());
	      
		  System.out.println("Could not find file path " + FilePath);
		  
	  }
	
	finally
	{
		
	}
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
  }
  
}
