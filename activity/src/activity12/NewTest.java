package activity12;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class NewTest
{
	WebDriver d;
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\chrome\\\\\\\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  d.get("https://www.bmw.com/en/index.html");
	  d.manage().window().maximize();
  }
  @Test
  public void f1()
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\\\\\\\firefox\\\\\\\\geckodriver.exe");
	  d=new FirefoxDriver();
	  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  d.get("https://www.lamborghini.com/en-en");
	  d.manage().window().maximize();
  }
  
  @BeforeTest
  public void beforeClass()
  {
	  System.out.println("opening two browser");
  }

  @AfterTest
  public void afterClass() 
  {
	  d.quit();
  }

}
