package activity1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest1 
{
	WebDriver d;
  @Test
  public void f() 
  {
	  System.out.println("audi website");
	  d.manage().window().maximize();
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("dream car website");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("buy dream car");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\\\\\\\chrome\\\\\\\\chromedriver.exe" );
	  d=new ChromeDriver();
	  d.get("https://www.audi.in/in/web/en.html");
  }

  @AfterTest
  public void afterTest() 
  {
  }

}
