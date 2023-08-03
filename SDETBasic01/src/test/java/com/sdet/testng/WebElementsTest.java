package com.sdet.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
//	  driver.get("https://www.leafground.com/");
//	  
//	  driver.findElement(By.id("email")).sendKeys("test@gmail.com");
//	  driver.findElement(By.name("message")).sendKeys("Hello world");
//	  driver.findElement(By.cssSelector("button[class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only\"]")).click();
//	  driver.close();
//	  driver.quit();
	  //-t001
	  
	  //--input fields
	  
	  //-t002
//	  driver.get("https://www.leafground.com/input.xhtml");
//	  boolean txtBoxEnabled=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]")).isEnabled();
//	  
//	  if(txtBoxEnabled==false) {
//		  System.out.println("text box is disabled");
//	  }
//	  driver.close();
//	  driver.quit();
	  //-t002
	  
	  //-t003
//	  driver.get("https://www.leafground.com/input.xhtml");
//	  System.out.println(driver.findElement(By.id("j_idt88:j_idt91")).getAttribute("value"));
//	  driver.close();
//	  driver.quit();
	  //-t003
	  
	  //-t004
//	  driver.get("https://www.leafground.com/input.xhtml");
//	  driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("test@gmail.com"+Keys.TAB);
//	  driver.close();
//	  driver.quit();
	  //-t004
	  
	  //--position
	  
	  //-t005
//	  driver.get("https://www.leafground.com/button.xhtml");
//
//	  String colorValue=driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("color");
//	  System.out.println(colorValue);
//	  String hexValue=Color.fromString(colorValue).asHex();
//	  System.out.println(hexValue);
//	  
//	  driver.close();
//	  driver.quit();
	  //-t005
	  
	  //-t006
//	  driver.get("https://www.leafground.com/button.xhtml");
//	  
//	  Dimension getSize=driver.findElement(By.id("j_idt88:j_idt98")).getSize();
//	  
//	  System.out.println(getSize.height);
//	  System.out.println(getSize.width);
//	  
//	  driver.close();
//	  driver.quit();
	  //-t006
	  
	  //--check box
	  
	  //-t007
//	  driver.get("https://www.leafground.com/checkbox.xhtml");
//	  
//	  List<WebElement> chboxes=driver.findElements(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td/div/div[2]"));
//	  
//	  for(WebElement chbox:chboxes) {
//		  chbox.click();
//	  }
//	  
//	  driver.close();
//	  driver.quit();
	  //-t007
	  
	  //--radio button
	  
	  //-t008
//	  driver.get("https://www.leafground.com/radio.xhtml");
//	  List<WebElement> radiobtns=driver.findElements(By.xpath("//table[@id='j_idt87:console2']/tbody/tr/td/div/div/input"));
//	  
//	  for(WebElement radio:radiobtns) {
//		  System.out.println(radio.isSelected());
//		  
//		  boolean statusRadio=radio.isSelected();
//		  
//		  if(statusRadio==true) {
//			  System.out.println("Safari is the default browser which is selected");
//		  }
//	  }
//	  
//	  driver.close();
//	  driver.quit();
	  //-t008
	  
	  //links
	  
	  //-t009
//	  driver.get("https://www.leafground.com/link.xhtml");
//	  System.out.println(driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href"));
//	  driver.close();
//	  driver.quit();
	  //-t009
	  
	  //deadlinks
	  
	  //-t010
//	  driver.get("https://www.leafground.com/link.xhtml");
//	  driver.findElement(By.linkText("Broken?")).click();
//	  
//	  String expTitle="Error 404 /lists.xhtml Not Found in ExternalContext as a Resource";
//	  String actTitle=driver.getTitle();
//	  
//	  System.out.println(expTitle);
//	  System.out.println(actTitle);
//	  
//	  Assert.assertEquals(expTitle, actTitle);
//	  
//	  driver.close();
//	  driver.quit();
	  //-t010
	  
	  
	  //--dropdown
	  
	  //-t011
//	  driver.get("https://www.leafground.com/select.xhtml");
//	  Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select")));
//	  dropdown.selectByVisibleText("Playwright");
//	  driver.close();
//	  driver.quit();
	  //-t011
	  
	  //--dropdownlist auto list
	  
	  //-t012
//	  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//troughout the script a common wait
//	  driver.get("https://demo.automationtesting.in/AutoComplete.html");
//	  driver.findElement(By.id("searchbox")).sendKeys("ind");	  
//	  WebDriverWait wait1=new WebDriverWait(driver, 20); //explicitwait only for a specific element and its condition
//	  
//	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']/li/a"))); // relative xpath
//	  
//	  List<WebElement> listElements= driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
//	  for(WebElement indElement:listElements) {
//		  if(indElement.getText().equalsIgnoreCase("India")) {
//			  indElement.click();
//		  }
//	  }
//	  driver.close();
//	  driver.quit();

	  //-t012
	  
	  //--img
	  
	  //-t013
	  
//	  driver.get("https://www.leafground.com/dashboard.xhtml");
//	  driver.findElement(By.xpath("//*[@id='j_idt15']")).click();
//	  //driver.findElement(By.id("j_idt15")).click();
	  
	  //-t013
	  
	  
	  
	  
	  
  }
}
