package com.softwaretestingo.sto00404_datatypes.string;
import com.softwaretestingo.abstraction.Test;
class string_comparison
{
   String str1="Software Testingo";
   String str2="Software Testingo";
   String str3="Software";
   String str4="Testingo";

   public void stringcompare()
   {
		/*
		 * 0 → both Strings are equal 
		 * Positive value (> 0) → first String is greater
		 * Negative value (< 0) → first String is smaller
		 */
	   	//return 0, because content are same.
	   	System.out.println(str1.compareTo(str2));

	   	//return greater than 0, because str1 
	   	//lexicographically greater than str2.
	   	System.out.println(str1.compareTo(str3));

	   	//return less than 0, because str1 
	   	//lexicographically less than str2.
	   	System.out.println(str3.compareTo(str4));
   }
}
public class String_Comparison_Using_CompareTo
{
   public static void main(String[] args) 
   {
      string_comparison obj=new string_comparison();
      obj.stringcompare();
   }
}