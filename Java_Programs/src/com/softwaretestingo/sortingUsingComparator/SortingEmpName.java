package com.softwaretestingo.sortingUsingComparator;
import java.util.ArrayList;
import java.util.Collections;
public class SortingEmpName 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Sorting using Comparator of Name
	 * 
	 */
	public static void main(String[] args) 
	{
		ArrayList<EmployeeClass> al=new ArrayList<EmployeeClass>();
		al.add(new EmployeeClass(11, "Manoj"));
		al.add(new EmployeeClass(22, "Manas"));
		al.add(new EmployeeClass(15, "Hari"));
		al.add(new EmployeeClass(20, "Java"));

		
		System.out.println("****** SORTING EMPNAME *********");
		Collections.sort(al, new EmpNameComparator());

		for(EmployeeClass e : al)
		{
			System.out.println(e.empno + "  " + e.ename);
		}
	}
}