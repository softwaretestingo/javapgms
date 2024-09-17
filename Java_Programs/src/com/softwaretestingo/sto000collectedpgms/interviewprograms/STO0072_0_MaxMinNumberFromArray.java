package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.Arrays;

public class STO0072_0_MaxMinNumberFromArray 
{	
	public static void main(String[] args) 
	{	
		int numArr[]= {99,2,55,6,88,-1};
		System.out.println("Input: "+Arrays.toString(numArr));
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
		System.err.println("Small No: "+small +" " +"Big No: "+larg);
	}
}