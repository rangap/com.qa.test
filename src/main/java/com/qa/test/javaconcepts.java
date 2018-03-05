package com.qa.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class javaconcepts 
{

	//************************************************************************//
	
	// Removing a Duplicate Number from an array.
	
	//************************************************************************//
	

	public void removeduplicateNumber() 
	{
	
		//Remove duplicate entry in a string array.
		
		String[] nriAccounts = {"NRE", "NRO", "FCNR", "RFC", "NRE"};
		HashSet<String> setOfAccounts = new HashSet<>(Arrays.asList(nriAccounts));
		System.out.println("Array contains: " + Arrays.toString(nriAccounts));
		System.out.println("HashSet contains: " + setOfAccounts);
	
		System.out.println("Iterating over HashSet in Java"); 
		for(String account: setOfAccounts)
		
		{ 
				System.out.println("hashset: " + account);
		
		}

		Integer[] Number = {10,20,30,10,40};
		HashSet<Integer> setOfNo = new HashSet<>(Arrays.asList(Number));
		
		HashSet<Integer> NoList = new HashSet<>();
		
		System.out.println("Array contains: " +Arrays.toString( Number));
		System.out.println("HashSet contains: " + setOfNo);
		
		System.out.println("Size of HashSet : " + setOfNo.size());

		for (int i=0; i<=setOfNo.size();i++)
		{
			
			NoList.add(Number[i]);
		}

		System.out.println("HashSet (NoList)  contains: " + NoList);
					
	}
	
	//************************************************************************//
	
		// Second Largest Number in Array using Treeset
		
		//************************************************************************//
	
	
	public void secondLargest() 
	{
	
		Integer[] Number = {10,50,20,40,30};
		TreeSet<Integer> myTreeSet = new TreeSet<>(Arrays.asList(Number));
		
		System.out.println("Before Sorting: " +Arrays.toString( Number));
		
		System.out.println("After Sorting Using TreeSet (myTreeSet) : " + myTreeSet);
		
		System.out.println("Size of TreeSet : " + myTreeSet.size());
		
		System.out.println("Second Largest Number : " + myTreeSet.lower(myTreeSet.last()));
		
				
	}

	//************************************************************************//
	
		// Sum of pairs 
		
	//************************************************************************//
	public void sumofPair(int sum)
	{
			
		Integer[] Number = {4, 5, 7, 11, 9, 13, 8, 12};
		
		for (int i = 0; i < Number.length; i++) 
		{ 
			int first = Number[i]; 
			for (int j = i + 1; j < Number.length; j++) 
			
				{ 
					int second = Number[j]; 
					if ((first + second) == sum) 
					{ 
						System.out.printf("(%d, %d) %n", first, second); 
					} 
				} 
		} 
		
		
		
	}
	
	//************************************************************************//
	
	// SeparateZerosFromNonZeros 
	
//************************************************************************//
	
	
	public void SeparateZerosFromNonZeros() 
	{
		
		Integer[] inputArray = {12, 0, 7, 0, 8, 0, 3};
        //Initializing counter to 0
		
		System.out.println("Before Sorting: " +Arrays.toString(inputArray));
 
        int counter = 0;
 
        //Traversing inputArray from left to right
 
        for (int i = 0; i < inputArray.length; i++)
        {
            //If inputArray[i] is non-zero
 
            if(inputArray[i] != 0)
            {
                //Assigning inputArray[i] to inputArray[counter]
 
                inputArray[counter] = inputArray[i];
 
                //Incrementing the counter by 1
 
                counter++;
            }
        }
 
        //Assigning zero to remaining elements
 
        while (counter < inputArray.length)
        {
            inputArray[counter] = 0;
 
            counter++;
        }
 
        System.out.println(Arrays.toString(inputArray));
		
	}
	
	
	
	//************************************************************************//
	
	// Reverse string 
	
//************************************************************************//	
	public void reverseString(String input)
	{
		
		char[] reverse=input.toCharArray();
		
		for(int i=reverse.length-1; i>=0; i-- )
		{
			System.out.print(reverse[i]);
		}
		
	}
	
	
	public void ReverseStringSwap(String data)
	{
		
	  String strArray[] = data.split(" ");
 
	  for(int i=0; i < strArray.length; i++)
	  {
		
		  char[] temparray = strArray[i].toCharArray();
		  for(int k=temparray.length-1; k>=0; k-- )
		  {
			  System.out.print( temparray[k]);
		  }
		        
	  }
	}
	
	
	public void testPrint()
	{
		System.out.print( "Welcome to Java Git Hub");
	}
	
	
	
	
}

