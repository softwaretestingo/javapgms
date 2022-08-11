package com.softwaretestingo.interviewprograms;
public class FindDuplicateElementFromArray1 
{
	public static void main(String[] args) 
	{
		String arrayElements[] = {"Testing","Manual Testing", "Java","Automation Testing", "Software Testing","Java", "Testing"};
		System.out.println("****Brute Force Technique ****");
		for(int i=0;i<arrayElements.length;i++)
		{
			for(int j=i+1;j<arrayElements.length;j++)
			{
				if(arrayElements[i].equals(arrayElements[j]))
				{
					System.out.println(arrayElements[i]);
				}
			}
		}
	}
}