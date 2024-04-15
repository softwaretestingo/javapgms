package com.softwaretestingo.sortingUsingComparator;
import java.util.Comparator;
public class EmpNameComparator implements Comparator<EmployeeClass>
{
	public int compare(EmployeeClass o1, EmployeeClass o2)
	{
		return o1.ename.compareTo(o2.ename);
	}
}
