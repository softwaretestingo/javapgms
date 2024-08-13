package com.softwaretestingo.sto02601_sorting.comparable;
import java.util.ArrayList;
import java.util.Collections;
public class STO0002_0_SortStringValue 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Sort String Value
	 * 
	 */
	public static void main(String[] args) 
	{
		ArrayList<STO0004_0_CompareToEmpClassStringValue> al=new ArrayList<STO0004_0_CompareToEmpClassStringValue>();
		al.add(new STO0004_0_CompareToEmpClassStringValue(11, "Manoj"));
		al.add(new STO0004_0_CompareToEmpClassStringValue(22, "Manas"));
		al.add(new STO0004_0_CompareToEmpClassStringValue(15, "Hari"));
		al.add(new STO0004_0_CompareToEmpClassStringValue(20, "Java"));
		
		// Sorting
		Collections.sort(al);
		
		for(STO0004_0_CompareToEmpClassStringValue e:al)
		{
			System.out.println(e.empno + "  "+e.ename);
		}

	}
}