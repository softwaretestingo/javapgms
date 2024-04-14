package com.softwaretestingo.string;
public class EqualsDemo3 
{ 
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Compare Two Values Using equals() Method
	 * 
	 */
	public static void main(String[] args) 
	{
		Long lng1 = 22l;
        Long lng2 = 22l;    
        Double dbl1 = 25.9d;
        Double dbl2 = 20.0d;
         
        System.out.println("Compare Two Long Values lng1 & lng2  : "+(lng1.equals(lng2)));  
        System.out.println("Compare Two Double  Values  dbl1 and dbl2 : "+(dbl1.equals(dbl2)));

	}
}