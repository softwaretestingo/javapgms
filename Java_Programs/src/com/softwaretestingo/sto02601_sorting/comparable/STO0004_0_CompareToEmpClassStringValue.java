package com.softwaretestingo.sto02601_sorting.comparable;
public class STO0004_0_CompareToEmpClassStringValue implements Comparable<STO0004_0_CompareToEmpClassStringValue>
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

	public STO0004_0_CompareToEmpClassStringValue(int empno, String ename) 
	{
		super();
		this.empno=empno;
		this.ename=ename;
	}

	//Sorting Ename (String Value)
	public int compareTo(STO0004_0_CompareToEmpClassStringValue o) 
	{
		return ename.compareTo(o.ename);
	}
}