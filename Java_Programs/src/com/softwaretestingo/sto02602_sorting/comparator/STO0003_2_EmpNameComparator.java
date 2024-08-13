package com.softwaretestingo.sto02602_sorting.comparator;
import java.util.Comparator;
public class STO0003_2_EmpNameComparator implements Comparator<STO0003_0_EmployeeClass>
{
	public int compare(STO0003_0_EmployeeClass o1, STO0003_0_EmployeeClass o2)
	{
		return o1.ename.compareTo(o2.ename);
	}
}
