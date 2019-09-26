package test0008;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  
	  
	 
	  
	  String Title =driver.getTitle();
	  System.out.println(Title);
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println("open browser");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
  }

}
