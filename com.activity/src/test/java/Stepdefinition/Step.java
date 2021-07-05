package Stepdefinition;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step 
{
	public static WebDriver d;
	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
	File file = new File("lib/chromedriver.exe");
	String filePath = file.getAbsolutePath();
	System.out.println(filePath);
	System.setProperty("webdriver.chrome.driver", filePath);
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("start-maximized");
	d = new ChromeDriver(chromeOptions);
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.get("https://www.apple.com/in/iphone/");
}
	@When("^user navigates to selecting phone page$")
	public void user_navigates_to_selecting_phone_page() throws Throwable
	{
	    d.findElement(By.xpath("//*[@id=\"chapternav\"]/div/ul/li[1]/a/figure")).click();   
	}
	
	@When("^user select the phone$")
	public void user_select_the_phone() throws Throwable 
	{
	  d.findElement(By.xpath("//*[@id=\"ac-localnav\"]/div/div[2]/div[2]/div[2]/div[2]/a")).click();  
	}
	
	@Then("^user gets the selected phone displayed$")
	public void user_gets_the_selected_phone_displayed() throws Throwable
	{
	 System.out.println("selected phone displayed");   
	}
}
