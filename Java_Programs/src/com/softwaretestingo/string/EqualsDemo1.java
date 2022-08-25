package com.softwaretestingo.string;
public class EqualsDemo1 
{
	public static void main(String[] args) 
	{
		String s1="SoftwareTestingo";  
		String s2="SoftwareTestingo";  
		String s3="SOFTWARETESTINGO";  
		String s4="SoftwareTestingo Blog";  
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  

	}
}