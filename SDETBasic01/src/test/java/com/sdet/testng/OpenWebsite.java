package com.sdet.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWebsite {
  @Test
  public void Chrome1() {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver;
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.google.lk/");
	  driver.close();
	  driver.quit();
	  
  }
}
