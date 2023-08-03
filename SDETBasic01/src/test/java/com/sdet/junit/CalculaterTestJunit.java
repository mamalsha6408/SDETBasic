package com.sdet.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculaterTestJunit {

	Calculater cal=new Calculater();
	
	@Test
	public void testadd1() {
		assertEquals(10, cal.add1(4, 6));
	}
	
	@Test
	public void testsub1() {
		assertEquals(4, cal.sub1(10, 6));
	}
	
	//just run this file 
	
	
}
