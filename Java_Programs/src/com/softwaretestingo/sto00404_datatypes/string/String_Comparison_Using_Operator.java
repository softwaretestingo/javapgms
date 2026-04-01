package com.softwaretestingo.sto00404_datatypes.string;

public class String_Comparison_Using_Operator
{
	public static void main(String[] args) 
	{
		String str1="Software Testingo";
	      String str2="Software Testingo";
	      String str3 = new String("SoftwareTestingo");

	      // String Comparison between Str1 and Str2
	      if (str1==str2)
	      {
	         System.out.println("Str1 & Str2 Reference Is Same");
	      }
	      else
	      {
	         System.out.println("Reference Of Both the String Object are Not Same");
	      }

	      //String Comparison between Str1 and Str3
	      if (str1==str3)
	      {
	         System.out.println("Str1 & Str3 Reference Is Same");
	      }
	      else
	      {
	         System.out.println("Reference Of Both the String Object are Not Same");
	      }

	}
}