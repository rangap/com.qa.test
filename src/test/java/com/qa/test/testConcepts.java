package com.qa.test;

import org.testng.annotations.Test;

public class testConcepts {
	
	javaconcepts obj= new javaconcepts();
	
	@Test
	public void removeDuplicate() {
		
		obj.removeduplicateNumber();
		
	}
	
	
	@Test
	public void secondLargest() {
		
		obj.secondLargest();
		
	}
	
	
	@Test
	public void sumofPair() {
		
		obj.sumofPair(20);
		
	}
	
	@Test
	public void SeparateZerosFromNonZeros() {
		
		obj.SeparateZerosFromNonZeros();
		
	}
	
	@Test
	public void reverseString() {
		
		obj.reverseString("Welcome");
		
	}
	
	@Test
	public void ReverseStringSwap() {
		
		obj.ReverseStringSwap("Java String Example");
		
	}
	
	@Test
	public void testPrint() {
		
		obj.testPrint();
		
	}
	
	
	
	@Test
	public void StringPermutation() 
	{

	String str = "ABC";
	int n = str.length();
	
	obj.permute(str, 0, n-1);

	}
	
	@Test
	public void factorial() 
	{

	
	obj.fact(5);

	}
	
}

