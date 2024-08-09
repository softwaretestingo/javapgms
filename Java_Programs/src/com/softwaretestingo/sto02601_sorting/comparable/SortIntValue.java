package com.softwaretestingo.sto02601_sorting.comparable;
import java.util.ArrayList;
import java.util.Collections;
public class SortIntValue 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Sort int Value
	 * 
	 */
	public static void main(String[] args) 
	{
		ArrayList<CompareToEmpClassIntValue> al=new ArrayList<CompareToEmpClassIntValue>();
		al.add(new CompareToEmpClassIntValue(11, "Manoj"));
		al.add(new CompareToEmpClassIntValue(22, "Manas"));
		al.add(new CompareToEmpClassIntValue(15, "Hari"));
		al.add(new CompareToEmpClassIntValue(20, "Java"));
		
		// Sorting
		Collections.sort(al);
		
		for(CompareToEmpClassIntValue e:al)
		{
			System.out.println(e.empno + "  "+e.ename);
		}

	}
}