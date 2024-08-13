package com.softwaretestingo.sto02601_sorting.comparable;
import java.util.ArrayList;
import java.util.Collections;
public class STO0001_0_SortIntValue 
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
		ArrayList<STO0003_0_CompareToEmpClassIntValue> al=new ArrayList<STO0003_0_CompareToEmpClassIntValue>();
		al.add(new STO0003_0_CompareToEmpClassIntValue(11, "Manoj"));
		al.add(new STO0003_0_CompareToEmpClassIntValue(22, "Manas"));
		al.add(new STO0003_0_CompareToEmpClassIntValue(15, "Hari"));
		al.add(new STO0003_0_CompareToEmpClassIntValue(20, "Java"));
		
		// Sorting
		Collections.sort(al);
		
		for(STO0003_0_CompareToEmpClassIntValue e:al)
		{
			System.out.println(e.empno + "  "+e.ename);
		}
	}
}