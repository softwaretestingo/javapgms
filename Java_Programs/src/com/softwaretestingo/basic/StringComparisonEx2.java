package com.softwaretestingo.basic;

public class StringComparisonEx2 
{
	String str1="SoftwareTestingo";
	String str2="SoftwareTestingo";
	String str3=new String("SoftwareTestingo");
	String str4 = "Welcome";
	String str5 = "SOFTWARETESTINGO";

	//Comparison Using equals() method
	public void stringcomparison()
	{

		//return true, because the content of both string are same.
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));

		//return false, because content of str2 and str4 are not same.
		System.out.println(str2.equals(str4));

		//return false, because the content of str2 and str5 are not same
		//str2 is small and str5 is capital in case
		System.out.println(str2.equals(str5));

		//return true, because both content are same ignoring the case
		System.out.println(str2.equalsIgnoreCase(str5));
	}
	public static void main(String[] args) 
	{
		StringComparisonEx2 obj=new StringComparisonEx2();
		obj.stringcomparison();

	}
}