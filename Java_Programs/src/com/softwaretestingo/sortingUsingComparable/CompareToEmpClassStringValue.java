package com.softwaretestingo.sortingUsingComparable;
public class CompareToEmpClassStringValue implements Comparable<CompareToEmpClassStringValue>
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Custom Sorting Order With Help Of Comparable
	 * 
	 */
	int empno;
	String ename;

	public CompareToEmpClassStringValue(int empno, String ename) 
	{
		super();
		this.empno=empno;
		this.ename=ename;
	}

	//Sorting Ename (String Value)
	public int compareTo(CompareToEmpClassStringValue o) 
	{
		return ename.compareTo(o.ename);
	}
}