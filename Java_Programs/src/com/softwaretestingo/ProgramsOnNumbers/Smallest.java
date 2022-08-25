package com.softwaretestingo.ProgramsOnNumbers;
import java.util.Arrays;
public class Smallest 
{
	public static boolean sumNo(int n, int N)
	{
		int sum=0;
		while (n!=0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		if(sum==N)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = { 97, 898, 5506, 79, 22822 };
		Arrays.sort(arr);
		for (int i= 0; i < arr.length; i++) 
		{ 
			if (sumNo(arr[i], 16)) 
			{
				System.out.println("smallest no" + arr[i]);
				break;
			}
		}
	}
}