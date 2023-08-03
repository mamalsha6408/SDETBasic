package com.sdet.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
  @Test
  public void test1() {
	  
	  //--locate elements using different methods
	  
	  //-t001
	  driver.get("https://www.leafground.com/");
	  
	  driver.findElement(By.id("email")).sendKeys("test@gmail.com");
	  driver.findElement(By.name("message")).sendKeys("Hello world");
	  driver.findElement(By.cssSelector("button[class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only\"]")).click();
	  driver.close();
	  driver.quit();
	  //-t001
	  
	  //--input fields
	  
	  //-t002
	  driver.get("https://www.leafground.com/input.xhtml");
	  boolean txtBoxEnabled=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]")).isEnabled();
	  
	  if(txtBoxEnabled==false) {
		  System.out.println("text box is disabled");
	  }
	  driver.close();
	  driver.quit();
	  //-t002
	  
	  //-t003
	  driver.get("https://www.leafground.com/input.xhtml");
	  System.out.println(driver.findElement(By.id("j_idt88:j_idt91")).getAttribute("value"));
	  driver.close();
	  driver.quit();
	  //-t003
	  
	  
	  
	  
  }
}
