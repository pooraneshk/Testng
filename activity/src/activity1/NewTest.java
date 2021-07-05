package activity1;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTest 
{
  WebDriver d;
  @BeforeMethod
  public void t()
  {
	  System.out.println("select your dream phone");
  }
  @AfterMethod
  public void t1()
  {
	  System.out.println("you have selected your dream phone");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\\\chrome\\\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.poorvikamobile.com/");
	  d.manage().window().maximize();
  }
  @Test
  public void f()  
  { 
	  d.findElement(By.xpath("//*[@class=\"fa fa-user\"]")).click();
	  //d.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[4]/div[1]/div/div[4]/i")).click();
	  d.findElement(By.xpath("//*[@href=\"https://www.poorvikamobile.com/login\"]")).click();
	 // d.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[4]/div[1]/div/div[4]/div/ul/li[1]/a")).click();
  }
  @Test 
  public void f1() throws InterruptedException
  {
	  d.findElement(By.id("emailphone")).sendKeys("pooraneshkumar77@gmail.com");
	  d.findElement(By.id("input-password")).sendKeys("Poorna@2997");
	  d.findElement(By.xpath("//*[@class=\"btn btn-primary pull-left\"]")).click();
	  //d.findElement(By.xpath("//*[@id=\"passwordDiv\"]/div[2]/input")).click();
	// WebElement f=d.findElement(By.xpath("//*[@class=\"clearfix  menu__link\"]"));
	  WebElement f=d.findElement(By.xpath("//*[@id=\"hide-menu\"]/div[2]/ul/li[1]"));
	  Actions a =new Actions(d);
	  a.moveToElement(f).build().perform();
	 
	  WebElement j=d.findElement(By.xpath("//*[@id=\"hide-menu\"]/div[2]/ul/li[1]/div/div/div/div/div/div/div[1]/div/ul/li/a"));
	  Actions v=new Actions(d);
	  v.moveToElement(j).build().perform();
	  //webelement j=d.findelement(by.xpath("//*[@href="https://www.poorvikamobile.com/mobiles-accessories/mobile-phones/iphones"]"));
	  d.findElement(By.xpath("//*[@id=\"hide-menu\"]/div[2]/ul/li[1]/div/div/div/div/div/div/div[1]/div/ul/li/ul/li[1]/a")).click();
	  d.findElement(By.id("hi-lw")).click();
	  WebElement t=d.findElement(By.xpath("//*[@class=\"slider-pointer custom-range\"]"));
	 // WebElement t=d.findElement(By.xpath("//*[@id=\"secondary\"]/div[4]/div/input[2]"));
	  Actions h=new Actions(d);
	  h.dragAndDropBy(t,10,0).perform();
	  d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  ((JavascriptExecutor)d).executeScript("scroll(0,2000)");
	  d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  d.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div/div[2]/div[10]/div/div[1]/div[1]/a/img")).click();
	  //d.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div/div[2]/div[27]/div/div[1]/div[1]/a/img")).click();
	  Set<String> p=d.getWindowHandles();
	  Iterator<String> it=p.iterator();
	  String parent=it.next();
	  String child=it.next();
	  d.switchTo().window(child);
	  d.findElement(By.xpath("//*[@id=\"romcolor146\"]/a/img")).click();
	  
  }
  @AfterTest
  public void afterTest() throws IOException
  {
	  File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	   Files.copy(scrFile, new File("D:/screenshot/s4.png"));
	 d.close();
  }

}