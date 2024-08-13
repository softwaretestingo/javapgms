package com.softwaretestingo.sto02602_sorting.comparator;
import java.util.ArrayList;
import java.util.Collections;
public class STO0001_0_SortingEmpno 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Sorting using Comparator of EmpNo
	 * 
	 */
	public static void main(String[] args) 
	{
		ArrayList<STO0003_0_EmployeeClass> al=new ArrayList<STO0003_0_EmployeeClass>();
		al.add(new STO0003_0_EmployeeClass(11, "Manoj"));
		al.add(new STO0003_0_EmployeeClass(22, "Manas"));
		al.add(new STO0003_0_EmployeeClass(15, "Hari"));
		al.add(new STO0003_0_EmployeeClass(20, "Java"));

		System.out.println("****** SORTING EMPNO *********");
		Collections.sort(al, new STO0003_1_EmpNoComparator());

		for(STO0003_0_EmployeeClass e : al)
		{
			System.out.println(e.empno + "  " + e.ename);
		}
		System.out.println("-------------------------------------");
		System.out.println("****** SORTING EMPNAME *********");
		Collections.sort(al, new STO0003_2_EmpNameComparator());

		for(STO0003_0_EmployeeClass e : al)
		{
			System.out.println(e.empno + "  " + e.ename);
		}


	}

}
