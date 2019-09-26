package test0008;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest001 {
  @Test  (priority=1)
  public void f1() 
  {
	  System.out.println("test1");
  }
  @Test  (priority=3)
  public void f2() {
	  System.out.println("test2");
  }
  @Test  (priority=4)
  public void f3() {
	  System.out.println("test3");
  }
  @Test (priority=2)
  public void f4() {
	  System.out.println("test4");
  }
  @BeforeClass  
  public void beforeClass() {
	  System.out.println("WebDriver");
  }

  @AfterClass 
  public void afterClass() {
	  System.out.println("Close");
  }

}
