package com.softwaretestingo.basic;

public class CompareToExample1 
{
	public static void main(String[] args) 
	{
		String s1="Software";  
		String s2="Software";  
		String s3="Visit";  
		String s4="Testingo";  
		String s5="Blog";  
		
		//Returns 0 because both are equal
		System.out.println(s1.compareTo(s2));
		//Returns -3 because "S" letter is 3 times lower than "V"
		System.out.println(s1.compareTo(s3));  
		//Return -1 because "S" is 1 times lower than "T"
		System.out.println(s1.compareTo(s4));  
		//Return 17 because "S" is 17 times greater than "S"
		System.out.println(s1.compareTo(s5));  

	}

}
