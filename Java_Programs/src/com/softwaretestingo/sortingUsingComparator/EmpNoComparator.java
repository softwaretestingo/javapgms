package com.softwaretestingo.sortingUsingComparator;

import java.util.Comparator;

public class EmpNoComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		EmployeeClass e1=(EmployeeClass) o1;
		EmployeeClass e2=(EmployeeClass) o2;
		
		if(e1.empno == e2.empno)
			return 0;
		else if(e1.empno > e2.empno)
			return 1;
		else
			return -1;
	}
}
