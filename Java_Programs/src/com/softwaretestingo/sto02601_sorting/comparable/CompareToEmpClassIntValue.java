package com.softwaretestingo.sto02601_sorting.comparable;
public class CompareToEmpClassIntValue implements Comparable
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Default Sorting Order By Using Comparable and CompareTo() Method
	 * 
	 */
	int empno;
	String ename;

	public CompareToEmpClassIntValue(int empno, String ename) 
	{
		super();
		this.empno=empno;
		this.ename=ename;
	}

	//Sorting Empno (Int Value)
	public int compareTo(Object o) 
	{
		CompareToEmpClassIntValue e=(CompareToEmpClassIntValue) o;
		if(empno==e.empno) 
			return 0; 
		else if(empno>e.empno) 
			return 1; 
		else 
			return -1;
	}
}