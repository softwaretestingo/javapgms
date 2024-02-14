package com.softwaretestingo.sortingUsingComparable;
public class CompareToEmpClassIntValue implements Comparable
{
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