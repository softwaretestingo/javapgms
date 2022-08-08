package com.softwaretestingo.basic;

import java.util.ArrayList;
import java.util.Collections;

class testing
{
	private String name;
	public testing(String str)
	{
		name=str;
	}
}
public class CompareToExample6 
{
	public static void main(String[] args) 
	{
		// Initializing Strings
        testing obj1=new testing("Manual Testing");
        testing obj2=new testing("Automation Testing");
        testing obj3=new testing("Java");
  
        ArrayList<testing> al=new ArrayList<testing>();
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        
        // performing binary search on the list al  
        Collections.binarySearch(al, "Sehwag", null);  
	}
} 