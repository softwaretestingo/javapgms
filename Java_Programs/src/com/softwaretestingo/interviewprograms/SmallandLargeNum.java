package com.softwaretestingo.interviewprograms;
public class SmallandLargeNum 
{	
	public static void main(String[] args) 
	{	
		int numArr[]= {99,2,55,6,88,-1};
		int small=numArr[0];
		int larg=numArr[0];
		
		for(int i=0;i<numArr.length;i++)
		{
			if(numArr[i]>larg)
			{
				larg=numArr[i];
			}	
			else if(numArr[i]<small)
			{
				small=numArr[i];
			}
		}
		System.err.println(small +" " +larg);
	}
}