package com.softwaretestingo.Array;
import java.util.HashSet;
import java.util.Set;
public class FindDuplicateElementFromArray2 
{
	public static void main(String[] args) 
	{
		String arrayElements[] = {"Testing","Manual Testing", "Java","Automation Testing", "Software Testing","Java", "Testing"};
		System.out.println("********* hash set ***********");
		Set<String>data=new HashSet<String>();
		for(String ele1: arrayElements)
		{
			if(data.add(ele1)== false)
			{
				System.out.println(ele1);

			}
		}
	}
}