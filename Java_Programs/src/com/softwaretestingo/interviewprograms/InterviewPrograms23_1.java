package com.softwaretestingo.interviewprograms;
import java.util.ArrayList;
import java.util.Arrays;
public class InterviewPrograms23_1 
{
	/*
	 * input :list1--[3,R,M,4,89,f] 
	 * OutPut:list2--[3,4,89,M,R,f]
	 */
	public static void main(String[] args) 
	{
		ArrayList lst=new ArrayList();
		ArrayList lstSorted=new ArrayList();

		lst.add(3);
		lst.add("R");
		lst.add("M");
		lst.add(4);
		lst.add(89);
		lst.add("f");

		String [] stringLst=new String[lst.size()];

		for(int i=0;i<lst.size();i++)
		{
			if(lst.get(i).getClass().getSimpleName().equalsIgnoreCase("Integer"))
			{
				stringLst[i]=Integer.toString((int)lst.get(i));
			}
			else
				stringLst[i]=(String)lst.get(i);
		}

		Arrays.sort(stringLst);

		for(int b=0;b<stringLst.length;b++)
		{
			lstSorted.add(stringLst[b]);
		}

		System.out.println("Given List: "+lst);
		System.out.println("Sorted List: "+lstSorted);
	}
}