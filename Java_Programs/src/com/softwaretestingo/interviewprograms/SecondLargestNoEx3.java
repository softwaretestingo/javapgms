package com.softwaretestingo.interviewprograms;
public class SecondLargestNoEx3 
{
	public static int getSecondLargest(int[] arr, int n) 
	{
		int largest=getLargest(arr,n);
		int res=-1;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=arr[largest])
			{
				if (res == -1)
					res =i;
				else if (arr[i]>arr[res])
					res=i;
			}
		}
		return res;
	}
	static int getLargest(int[] arr, int n)
	{
		int largest=0;
		for (int i=1;i<n;i++)
		{
			if (arr[i]<arr[largest])
				largest=i;

		}
		return largest;
	}
	public static void main(String[] args) 
	{
		int a[] = { 11,10,4, 15, 16, 13, 2 };
		int aSize=a.length;
		System.out.println("Second Largest: " +getSecondLargest(a, aSize ));
	}
}