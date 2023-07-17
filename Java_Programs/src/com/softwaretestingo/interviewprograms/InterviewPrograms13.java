package com.softwaretestingo.interviewprograms;
import java.util.ArrayList;
import java.util.List;
public class InterviewPrograms13 
{
	/*
	 * Input = [1,2,2,3,4,5,5,3] 
	 * Output = [1,3,4,3]
	 */
	public static void main(String[] args) 
	{
		int Input[] = {1,2,2,3,4,5,5,3};
		List<Integer> list= new ArrayList<>();
		List<Integer> list1= new ArrayList<>();
		for (int i = 0; i <= Input.length-1; i++) 
		{
			list.add(Input[i]);
		}
		for (int j = 0; j <= list.size()-1; j++)
		{
			if(j==list.size()-1)
			{
				if(list.get(j).equals(list.get(j-1)))
				{
				}
				else 
				{
					list1.add(list.get(j));
				}
				break;
			}
			if(list.get(j).equals(list.get(j+1)))
			{
				j=j+1;
			}
			else if ( j!=0 && list.get(j).equals(list.get(j-1)) ) 
			{
				//j=j+1;
			}
			else 
			{
				list1.add(list.get(j));
			}
		}
		for(Integer d:list1)
		{
			System.out.print(d);
		}
	}
}
