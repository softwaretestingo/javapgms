package com.softwaretestingo.sortingUsingComparable;
import java.util.ArrayList;
import java.util.Collections;
public class SortStringValue 
{
	public static void main(String[] args) 
	{
		ArrayList<CompareToEmpClassStringValue> al=new ArrayList<CompareToEmpClassStringValue>();
		al.add(new CompareToEmpClassStringValue(11, "Manoj"));
		al.add(new CompareToEmpClassStringValue(22, "Manas"));
		al.add(new CompareToEmpClassStringValue(15, "Hari"));
		al.add(new CompareToEmpClassStringValue(20, "Java"));
		
		// Sorting
		Collections.sort(al);
		
		for(CompareToEmpClassStringValue e:al)
		{
			System.out.println(e.empno + "  "+e.ename);
		}

	}
}