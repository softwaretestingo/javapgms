package com.softwaretestingo.string;

public class StringConstantPool 
{
	public static void main(String[] args) 
	{
		//it will get stored in the string pool      
		String str1 = "Software";  
		String str2 = "Testingo";

		//str3 will not be created in the string pool
		String str3 = "Software";    

		//stored in Java heap memory
		String str4 = new String ("Software");
		//stored in Java heap  memory
		String str5 = new String ("Testingo");

		//it will be stored in string pool  
		String str6 = new String ("Software").intern(); 

		//returns false because both object reference is different
		System.out.println(str1 == str4);  
		//returns false 
		//str2 occupies space in string pool and str5 occupies space in Java heap  
		System.out.println(str2 == str5);   
		//it returns true
		//address of both strings are the same
		System.out.println(str1 == str3);   
	}
}