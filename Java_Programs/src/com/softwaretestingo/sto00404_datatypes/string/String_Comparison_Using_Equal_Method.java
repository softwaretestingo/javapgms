package com.softwaretestingo.sto00404_datatypes.string;

public class String_Comparison_Using_Equal_Method 
{
	public static void main(String[] args) 
	{
		String str1="Software Testingo";
	      String str2="Software Testingo";
	      String str3 = new String("Software Testingo");
	      String str4="Software";
	      String str5="SOFTWARE TESTINGO";

	      //Comparing Str1 & Str2
	      if(str1.equals(str2))
	      {
	         System.out.println("Both Str1 & Str2 have the same value");
	      }
	      else
	      {
	         System.out.println("Both have the different value");
	      }
	      //Comparing Str1 & Str3
	      if(str1.equals(str3))
	      {
	         System.out.println("Both Str1 & Str3 have the same value");
	      }
	      else
	      {
	         System.out.println("Both have the different value");
	      }
	      //Comparing Str2 & Str4
	      if(str2.equals(str4))
	      {
	         System.out.println("Both Str2 & Str4 have the same value");
	      }
	      else
	      {
	         System.out.println("Both str2 & str4 have the different value");
	      }
	      //Comparing Str2 & Str5, Here content same but different in case
	      if(str2.equals(str5))
	      {
	         System.out.println("Both Str2 & Str5 have the same value");
	      }
	      else
	      {
	         System.out.println("Both Str2 & Str5 have the same value but different in case");
	      }

	      //Comparing Str2 & Str5, Here content same but ignore case
	      if(str2.equalsIgnoreCase(str5))
	      {
	         System.out.println("Both Str2 & Str5 have the same value");
	      }
	      else
	      {
	         System.out.println("Both have the same value but different in case");
	      }
	}
}