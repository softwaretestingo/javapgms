package com.softwaretestingo.ProgramsOnNumbers;
import java.util.Arrays;
public class SecondSmallestSecondLargestEx1 
{
	static private void getElements(int[] arr, int n)
	{
		if (n == 0 || n==1)
		{
			System.out.print(-1);
			System.out.print(" ");
			System.out.print(-1);
			System.out.print("\n");
		}
		Arrays.sort(arr);
		int small = arr[1];
		int large = arr[n - 2];
		System.out.println("Second smallest is "+small);
		System.out.println("Second largest is "+large);
	}
	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 4, 6, 7, 5};
		int n = arr.length;
		getElements(arr, n);		
	}
}