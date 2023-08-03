package com.sdet.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculaterTestng {
	
	Calculater cal=new Calculater();
	
  @Test
  public void addTest1() {
	  Assert.assertEquals(10, cal.add1(6, 4));
  }
  
  @Test
  public void subTest1() {
	  Assert.assertEquals(2, cal.sub1(6, 4));
  }

}
