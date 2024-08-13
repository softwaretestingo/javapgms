package com.softwaretestingo.sto02602_sorting.comparator;
import java.util.Comparator;
public class STO0003_1_EmpNoComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		STO0003_0_EmployeeClass e1=(STO0003_0_EmployeeClass) o1;
		STO0003_0_EmployeeClass e2=(STO0003_0_EmployeeClass) o2;
		
		if(e1.empno == e2.empno)
			return 0;
		else if(e1.empno > e2.empno)
			return 1;
		else
			return -1;
	}
}
